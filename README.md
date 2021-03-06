# Pre-work - Todo App

**Todo App** is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: **Derek P. Collins**

Time spent: **2** hours spent in total

## User Stories

The following **required** functionality is completed:

* [x] User can **successfully add and remove items** from the todo list
* [x] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [x] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='http://i.imgur.com/h7hWQdY.gif' title='Video Walkthrough' height='654' width='367' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

As noted by **Mathew Lent** in the comments on the [Android Project 0: ToDo App Walkthrough video](https://vimeo.com/72475810), I had to add a `catch` for handling the case where the file doesn't exist. The app was crashing on startup without this:

```java
private void readItems() {
  File filesDir = getFilesDir();
  File file = new File(filesDir, "todo.txt");
  try {
    todoItems = new ArrayList(FileUtils.readLines(file));
  } catch (FileNotFoundException e) {
    todoItems = new ArrayList();
  } catch (IOException e) {

  }
}
```

To have the cursor show up at the end of the string in the EditText field in EditItemActivity, use `append()` instead of `setText()`. [Source](http://stackoverflow.com/questions/14673716/android-how-to-set-the-edittext-cursor-to-the-end-of-its-text)

To show the keyboard automatically when EditItemActivity appears, use the following:

```java
if(etUpdateText.requestFocus()) {
  getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
}
```

[Source](http://stackoverflow.com/questions/14327412/set-focus-on-edittext)

## License

    Copyright 2017 Derek P. Collins

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
