

# Android Stopwatch App ⏱️

## 🌟 Overview
This project showcases a simple yet functional Android stopwatch app. The app provides start, stop, and reset functionalities for time tracking, with a clear and user-friendly interface. The main activity handles the timer operations and updates the UI with the current elapsed time in a HH:MM:SS format.

## 🛠️ Project Structure
The project is structured around a `MainActivity` that uses a `Handler` and `Runnable` to manage the stopwatch operations. The app layout is defined using View Binding for efficient and type-safe access to UI components.

### Key Components
- **MainActivity**:
  - Initializes the app and sets up the user interface.
  - Handles start, stop, and reset operations for the stopwatch.
  - Updates the timer display every second using a `Handler` and `Runnable`.

- **Handler and Runnable**:
  - **Handler**: Manages the timing tasks by scheduling `Runnable` executions.
  - **Runnable**: Updates the elapsed time and the UI every second.

- **View Binding**:
  - Used for efficient and type-safe access to UI components defined in the layout XML.

### MainActivity Details
- **Initialization**:
  - Sets up View Binding and initializes the timer variables.
  - Configures button click listeners for start, stop, and reset operations.

- **Start Timer**:
  - Begins the timer if it's not already running.
  - Disables the start button and enables stop and reset buttons.

- **Stop Timer**:
  - Stops the timer if it's running.
  - Enables the start button and updates its text to "Resume".

- **Reset Timer**:
  - Stops the timer and resets the elapsed time to 00:00:00.
  - Resets the start button text to "Start" and disables the reset button.

## 📷 Screenshots
<img src="https://github.com/leoschwedler/StopWatch/assets/77402907/12c1635a-285a-4553-9e28-02945adf83da" width="260"/>
<img src="https://github.com/leoschwedler/StopWatch/assets/77402907/7ff2b76d-2011-48e5-8dc7-c5c3024e6476" width="260"/>
<img src="https://github.com/leoschwedler/StopWatch/assets/77402907/ffb3a405-648a-4f5c-a3f5-85e62c3fbc10" width="260"/>

## 🚀 Implemented Features
The project demonstrates the following functionalities:
- Timer with start, stop, and reset functionalities.
- Real-time timer update using `Handler` and `Runnable`.
- User-friendly interface with start, stop, and reset buttons.
- Efficient UI management using View Binding.

  

## 🛠️ Dependencies
- `androidx.appcompat:appcompat`
- `androidx.core:core-ktx`
- `androidx.activity:activity-ktx`
- Additional dependencies as required by the project.

## 📌 License
This project is open-source and available under the [MIT License](LICENSE).
