## Brief Work of the App

### Functional Files

**MainActivity.kt** - Navigation controls, handling user interactions directly from the app's launch.

**NewTaskSheet.kt** - Handle the creation of new tasks within the app. Using a bottom sheet to allow users to input details for a new task.

**TaskItem.kt** - Defines the features of a task. This includes properties such as task ID, description, completion status, etc.

**TaskItemAdapter.kt** - This adapter is used for managing a list or grid of task items in a RecyclerView, which is a common Android component for displaying dynamic content lists.

**TaskItemClickListener.kt** - Defines an interface for handling clicks on task items.

**TaskItemViewHolder.kt** - Works closely with the TaskItemAdapter; it holds the UI elements of each task item displayed in the list, like text views or buttons.

**TaskViewModel.kt** - Manages the data concerning the tasks and handles business logic, separating it from the UI.

### Layout Files

**activity_main.xml** - main layout, using RelativeLayout
**fragment_new_task_sheet.xml** - bottom sheet layout, using LinearLayout
**task_item_cell.xml** - layout for each task item, using LinearLayout

## Hours I took yo complete

About 8 hours followed the instructions and explanations from website resources and YouTube video

## Most Challenging Parts

1. Arranging the task items in RelativeLayout
2. Reuse the bottom sheet for add and edit task based on current status
3. Learn Kotlin data structures and functions

## Reference

1. https://medium.com/@tanunprabhu95/to-do-list-application-using-kotlin-using-android-studio-546e74ac75aa
2. https://www.youtube.com/watch?v=RfIR4oaSVfQ