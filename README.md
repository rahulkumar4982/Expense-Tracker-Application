# Expense Tracker Application

## Overview

The **Expense Tracker Application** is a cross-platform desktop application designed to help users manage and track their daily expenses. It allows users to input various expenses, categorize them, and visualize spending trends over time through interactive charts. The application also supports data export functionality, enabling users to save their expense data in CSV format for further analysis or reporting.

This project is built using Java, JavaFX, JFreeChart, and Apache POI libraries. The application is designed with a clean and simple user interface to ensure a smooth user experience.

## Features

### 1. **Track Daily Expenses**
   - Users can easily add daily expenses by specifying the **category**, **amount**, **description**, and **date**.
   - Categories include **Food**, **Transportation**, **Entertainment**, and **Other**.
   
### 2. **Visualize Spending Trends**
   - The application displays interactive **bar charts** that show the breakdown of expenses by category.
   - Charts are generated using **JFreeChart**, providing an insightful and visual representation of spending habits.

### 3. **Data Export to CSV**
   - Users can export their expense data to a **CSV** file format, which can be opened in tools like Excel or Google Sheets for further analysis.
   - The export functionality ensures users can back up their data and analyze it outside the application.

### 4. **Cross-Platform**
   - Built using **JavaFX**, the application is cross-platform, meaning it can run on Windows, macOS, and Linux.
   
### 5. **Intuitive User Interface**
   - The application provides a user-friendly interface, with a simple layout consisting of input fields, a table for displaying expenses, and a button to generate the chart and export data.

## Technologies Used

- **Java**: Core programming language for application logic.
- **JavaFX**: Used for creating the graphical user interface (GUI).
- **JFreeChart**: Used for generating charts that display expense data trends.
- **Apache POI**: Used for exporting data to CSV format.
- **FXML**: Used for defining the UI structure of the application.
- **Maven**: Dependency management (if you're using Maven for builds).
