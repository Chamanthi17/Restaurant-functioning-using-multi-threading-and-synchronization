# 🍽️ Restaurant Functioning Using Multi-threading and Synchronization

This Java project simulates the functioning of a restaurant using multi-threading and synchronization primitives. The model handles essential restaurant operations such as:

  Checking table availability

  Assigning tables to customers in order of arrival

  Managing cook availability

  Tracking availability of menu items (burgers, fries, coke)

  Coordinating concurrent tasks to satisfy customers efficiently

---

# 🗂️ Project Structure

Restaurantfolder/

├── BurgerMachine.java    # Thread managing burger preparation

├── CokeMachine.java      # Thread managing coke dispensing

├── Cooks.java            # Thread class representing cooks

├── Diners.java           # Thread class representing customers

├── FriesMachine.java     # Thread managing fries preparation

├── Order.java            # Order details and status

├── OrderList.java        # Collection of orders management

├── Restaurant.java       # Main restaurant operations & synchronization

├── TableObject.java      # Table data model

├── Tables.java           # Collection of table objects

App.java              # Main application entry point

input1.txt            # Sample input 1 (customer orders)

input2.txt            # Sample input 2 (customer orders)

README.md             # This file

Final presentation.pdf# Project presentation slides

---

# 🚀 How It Works

Multi-threading: Different threads simulate cooks, diners, and machines working in parallel.

Synchronization: Ensures that tasks like table assignment and food preparation happen in the correct order without conflicts.

Order Management: Orders are queued and processed in the order of arrival.

Resource Availability: Tables, cooks, and machines are shared resources synchronized to prevent race conditions.

---

# ⚙️ How to Run Locally

Compile all .java files:

javac Restaurantfolder/*.java

Run the main program:

java Restaurantfolder.App

The program reads input files (input1.txt, input2.txt) for orders. Make sure these files are in the same directory.

---

# 🛠 Concepts Demonstrated

Java Threads (extends Thread or implements Runnable)

Synchronization (synchronized, wait(), notify())

Shared resource management (tables, machines)

Producer-consumer model for order processing

Handling concurrent customer requests fairly

---
# 🙋‍♀️ Author

Chamanthi Pyneni

This project deepened my understanding of Java concurrency and synchronization while simulating real-world restaurant operations in an engaging way.
