# Test task

<details><summary>Create user task</summary>
User class fields: name, age; <br> 
Notice that we can only create user with createUser <br> 
method without using constructor or builder <br> 
</details>

<details><summary>Create factory</summary>
that can create a product for a specific type: Real or Virtual <br> 
Product class fields: name, price <br> 
Product Real class additional fields: size, weight <br> 
Product Virtual class additional fields: code, expiration date <br> 
</details>

<details><summary>Create Order class</summary>
with method createOrder <br> 
Order class fields: User, List<Price> <br> 
Notice that we can only create order with createOrder <br> 
method without using constructor or builder <br> 
</details>


1). Create singleton class which will check the code is used already or not.
Singleton class should have the possibility to mark code as used and check if code used

2). Create a functionality to get the most expensive ordered product

3). Create a functionality to get the most popular product (product bought by most users) among users

4). Create a functionality to get average age of users who bought realProduct2

5). Create a functionality to return map with products as keys and a list of users who ordered each product as values

6). Create a functionality to sort/group entities:
a) Sort Products by price
b) Sort Orders by user age in descending order

7). Calculate the total weight of each order
