# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project](\Copy of UML Diagram.png)

## Description
The store which I decided to make was an Apple Store. This was because not to long before the assignment was given to us I went to the mall and saw an Apple Store which jogged my memory of all the fond memories I had made there years prior. My project consisted of a superclass of Apple and two subclassed named Phone and Airpods. The superclass contained three instance variables which also applied to the subclasses which had their own unique instance variable. Additionally each class had accessor, mutator, and toString methods to be called in the tester class called StoreRunner. I decided to utilize user input in my project which led me to use the scanner class. The user simply had to answer questions with a yes or no answer or to pick a choice out of two options. My goal was to get the user to undergo a series of questions to determine the product best suited for their liking. Once I determined this through several if-else scenarios the program would alter the value of the instance variables in both classes and print out a reciept. 

