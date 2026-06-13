# Hotel Reservation System

## Overview

The Hotel Reservation System is a console-based Java application that allows users to manage hotel room bookings efficiently. The system enables customers to view available rooms, book rooms, cancel reservations and track booking history. It is designed using Object-Oriented Programming (OOP) principles and Java Collections Framework.

## Features

* View available rooms
* Book a room
* Cancel room reservations
* View all room details
* Track booking history
* Calculate total revenue generated
* Manage customer information
* Menu-driven user interface

## Technologies Used

* Java
* OOP (Object-Oriented Programming)
* HashMap
* ArrayList
* Scanner Class

## Project Structure

```text
HotelReservationSystem/
│
├── Room.java
├── HotelReservationSystem.java
├── README.md
└── screenshots/
```

## Classes Used

### Room.java

Represents a hotel room and contains:

* Room Number
* Room Type
* Room Price
* Booking Status
* Customer Name

### HotelReservationSystem.java

Handles:

* Room Management
* Booking Operations
* Cancellation Operations
* Revenue Tracking
* Booking History

## Functionalities

### View Available Rooms

Displays all rooms that are currently available for booking.

### Book Room

Allows a customer to reserve a room by providing:

* Room Number
* Customer Name

### Cancel Booking

Allows users to cancel an existing reservation.

### View All Rooms

Displays complete room information including booking status.

### Booking History

Maintains a record of all booking and cancellation activities.

### Revenue Tracking

Displays the total revenue generated from room bookings.

## Sample Output

```text
===== HOTEL RESERVATION SYSTEM =====

1. View Available Rooms
2. Book Room
3. Cancel Booking
4. View All Rooms
5. Booking History
6. Total Revenue
7. Exit

Enter Choice: 2

Enter Room Number: 101
Enter Customer Name: Sathish

Room Booked Successfully!
```

## Time Complexity

| Operation            | Complexity |
| -------------------- | ---------- |
| Book Room            | O(1)       |
| Cancel Booking       | O(1)       |
| Search Room          | O(1)       |
| View Available Rooms | O(n)       |
| View All Rooms       | O(n)       |
| View History         | O(n)       |

## Learning Outcomes

* Object-Oriented Programming
* Encapsulation
* Java Collections Framework
* HashMap Operations
* ArrayList Operations
* Menu-Driven Applications
* Data Management Techniques

## Future Enhancements

* GUI using Java Swing
* Database Integration
* Online Payment System
* User Authentication
* File-Based Data Storage
* Room Search Filters

## Author

Sathish Chekuri
