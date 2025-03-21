📌 Activity & Fragment Lifecycle Logger
This repository demonstrates the lifecycle behavior of Activities and Fragments, including logging when navigating between them and when opening UI components like BottomSheets, AlertDialogs, and DialogFragments.

✨ Features
✔️ Logs lifecycle methods of Activity and Fragment during navigation.
✔️ Prints logs when opening BottomSheetDialog, AlertDialog, and DialogFragment from both Activity and Fragment.
✔️ Helps analyze how lifecycle events behave when UI components are displayed.
✔️ Useful for debugging and understanding lifecycle transitions.

🛠 Usage
Run the app and navigate between Activities and Fragments.
Open a BottomSheet, AlertDialog, or DialogFragment and observe the lifecycle logs.
Compare the behavior when switching screens versus displaying dialogs.
📌 Surprising Insight: The logs reveal that opening a BottomSheet, AlertDialog, or DialogFragment does not trigger any lifecycle methods in the hosting Activity or Fragment—not even onPause(). 🚀

📱 Test Device
✔️ Device Model: OnePlus Nord 2
✔️ Android Version: 13

### 🚀 Application Walkthrough

To observe lifecycle methods, **clone the repository** and filter logs by **`DemoL`** in **Logcat**.

1. When the app launches, it opens the **MainActivity**.
2. The MainActivity includes several buttons:
   - **Open Fragment**: Launches a new Activity containing a Fragment. Fragment lifecycle methods are logged in Logcat.
   - **Bottom Sheet**: Opens a BottomSheetDialog and logs its lifecycle methods. Activity lifecycle methods remain unchanged.
   - **Simple Alert Dialog**: Displays an AlertDialog. No Activity lifecycle methods are triggered.
   - **Dialog Fragment**: Opens a DialogFragment and logs its lifecycle methods. Again, Activity lifecycle methods are not called.
   - **Floating Action Button**: Launches a new Activity. Lifecycle methods of both current and new Activities are logged.

* **When you open the application Activity1 start and open the next activity2 and click back. Activity lifecycle will be:**
    - MainActivityLog          D  onCreate() called
    - MainActivityLog          D  onStart() called
    - MainActivityLog          D  onResume() called
    - MainActivityLog          D  onPause() called
    - MainActivityLog2         D  onCreate() called
    - MainActivityLog2         D  onStart() called
    - MainActivityLog2         D  onResume() called
    - MainActivityLog          D  onStop() called
    - MainActivityLog2         D  onPause() called
    - MainActivityLog          D  onStart() called
    - MainActivityLog          D  onResume() called
    - MainActivityLog2         D  onStop() called
    - MainActivityLog2         D  onDestroy() called

* **When you open the application Activity1 start and open the next activity2 and open next activity 3 and click back. Activity lifecycle will be:**
    - MainActivityLog         D  onCreate() called
    - MainActivityLog         D  onStart() called
    - MainActivityLog         D  onResume() called
    - MainActivityLog         D  onPause() called
    - MainActivityLog2        D  onCreate() called
    - MainActivityLog2        D  onStart() called
    - MainActivityLog2        D  onResume() called
    - MainActivityLog         D  onStop() called
    - MainActivityLog2        D  onPause() called
    - MainActivityLog3        D  onCreate() called
    - MainActivityLog3        D  onStart() called
    - MainActivityLog3        D  onResume() called
    - MainActivityLog2        D  onStop() called
    - MainActivityLog3        D  onPause() called
    - MainActivityLog2        D  onStart() called
    - MainActivityLog2        D  onResume() called
    - MainActivityLog3        D  onStop() called
    - MainActivityLog3        D  onDestroy() called
    - MainActivityLog2        D  onPause() called
    - MainActivityLog         D  onStart() called
    - MainActivityLog         D  onResume() called
    - MainActivityLog2        D  onStop() called
    - MainActivityLog2        D  onDestroy() called

* **When an activity with a fragment is launched, what is the sequence of lifecycle methods called for both the activity and the fragment?**
    - Activity  onCreate() called
    - Frag      onAttach called
    - Frag      onCreate called
    - Frag      onCreateView called
    - Frag      onViewCreated called
    - Frag      onViewStateRestored called
    - Frag      onStart called
    - Activity  onStart() called
    - Activity  onResume() called
    - Frag      onResume called

* **When a BottomSheet/ Alert dialog / Dialog Fragment is opened from an Activity or Fragment, which lifecycle methods of the Activity/Fragment are triggered?** 
    - None of the Activity or Fragment lifecycle methods are called.
    - A video demonstrates that opening a BottomSheet, AlertDialog, or DialogFragment from an Activity or Fragment does not trigger any lifecycle methods in the hosting Activity or Fragment—not even onPause(), which is quite surprising.



https://github.com/user-attachments/assets/4401f755-9bb8-432b-8716-2fc19144b4ca

1. When the app is launched, sent to the background, and brought back to the foreground, all lifecycle methods of the **Activity** are logged in the console.  
2. When a **BottomSheet** is opened and closed, all its lifecycle methods are triggered, but **none** of the Activity’s lifecycle methods are called.  
3. When an **AlertDialog** is opened and closed, **no Activity lifecycle methods** are triggered.  
4. The same behavior is observed when a **DialogFragment** is opened and closed—**no Activity lifecycle methods** are invoked.  
5. The same pattern applies when these dialogs are opened from a **Fragment**—the hosting Fragment’s lifecycle methods remain untouched.
