# Lawn_Service_Management
The user runs a summer lawn mowing service and the application helps manage clients and predicts revenue.

# Application Goal:

The goal of this application is to enter a series of new clients for a summer lawn mowing service. When all clients and their data have been entered the application will output a report.


# Application Setup:

When the application is launched it will ask the user for information on a new client, one client at a time. Once a client’s data has been entered it will ask the user if they would like to add a new client. The user will continue adding clients until they indicate they are done.

After all clients have been entered the application will output a report on each client and end with a summary report about the summer’s work.


#Application Inputs:

The application will ask for the following regarding each client:

The name of the client
The length of the client’s lawn
The width of the client’s lawn
The number of payments that the client will be making
One payment
Two payments
Twenty-two payments (which is once a week for the whole mowing season)
After all these have been entered, the application will ask the user if they want to enter a new client. If the user enters a “Y” or a “y” then the application starts over again with the above list.


# Client Report:

After all the clients have been entered the application will output a report for each client. Here is an example of what the report could look like.

Client: Aisha Baqri
Lawn Size: 375 sq. yds.
Number of Payments: 2
Amount of each payment: $255.00
Total of all payments: $510.00


# Summary Report:

After all the Client Reports have been output to the terminal the application will generate and output a summary report on all the clients. Here is an example of what the report could look like.

Total Number of clients: 5
Total square yards to mow: 5,000
Total revenue for the summer: $2,500.00


# Charge Calculation:

The amount that a client is charged has 2 portions: a season charge based on the size of their lawn; and a service charge based on how many payments they will make.

The season will last 22 weeks.
The season charge depends on the size of the lawn. If the lawn area is:
Less than 500 sq. yds., the season charge is $25 per week times the number of weeks.
Greater than or equal to 500 sq. yds. and less than 800 sq. yds., the season charge is $35 per week times the number of weeks.
Greater than or equal to 800 sq. yds., the season charge is $50 per week times the number of weeks.

The service charge is based on how many payments the client makes. If the customer makes
One payment, there is no service charge.
Two payments, the service charge is $5 per payment.
Twenty-two payments, the service charge is $3 per payment.

# Screenshot
<img src="https://github.com/mattbroph/Lawn_Service_Management/blob/main/screenshots/application_output.png">

