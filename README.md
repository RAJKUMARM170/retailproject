# Retail Discount Calculator

## Overview

This project calculates the net payable amount on a bill after applying applicable discounts based on user type and bill amount.

## Requirements

- Java 11
- Maven
- Spring Boot

## Build and Run

### Build the Project

```bash
mvn clean install
api end point
POST /api/calculate
request
{
  "user": {
    "name": "John Doe",
    "userType": "EMPLOYEE",
    "customerSince": "2022-01-01"
  },
  "bill": {
    "totalAmount": 200,
    "hasGroceries": false
  }
}

response
{
  "finalAmount": 140
}"# retailproject" 
"# retailproject" 
