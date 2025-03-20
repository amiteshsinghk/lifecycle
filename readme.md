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

* **When a BottomSheet/ Alert dialog is opened from an Activity or Fragment, which lifecycle methods of the Activity/Fragment are triggered?** 
    - None of the Activity or Fragment lifecycle methods are called.