# Microservice for E-Commerce project

## Introduction

This document describes the design and implementation of microservices for an e-commerce project. 
The goal is to break down the project's functionalities and create individual microservices 
that follow the principles of microservice architecture

## Microservices

this is one of the microservices for this E-commerce project

## User Service

The User Service is responsible for managing the user accounts

## functionalities

- **postUser** create new user
- **getAllUser** show all the user information it can be use for administrative purpose.
- **getUserById** show specific user .
- **updateUserById** update user details that match the user id
- **deleteUserById** delete user that match the user id

This functionality is isolated from other services as user management is a critical aspect of the e-commerce project
and it is necessary to have a separate service for it to ensure the security and reliability of the system.