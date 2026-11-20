# System Design

## Vehicle Management
The system uses an abstract Vehicle class as the base class. Car and Bike extend it and have different parking rates.

## Parking Management
An ArrayList stores the vehicles currently parked in the lot.

## Fee Calculation
The parking fee is calculated using the number of hours parked and the vehicle's hourly rate.

## Exit History
A custom singly linked list stores the license plate numbers and fees of vehicles that have exited.

## Exception Handling
Custom exceptions handle situations where the parking lot is full or a vehicle cannot be found.