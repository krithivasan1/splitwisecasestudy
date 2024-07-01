Split wise - Design and Coding steps

Steps
Understand the requirement, take nouns, Visualize ( either physical structure or user journey ) , create the models
 Models - Create Models
 BaseModel
 Expense
 ExpenseUser
 Group
 User
 ExpenseType

For all the model , We have to include Getter, Setter from Lombok
For all the model, We have to extend BaseModel. Only then the Id , modified By, CreatedBy

Define the model with the attributes
 Create base class
 In the base class, we have to put long id , date timecreatedby, date timeModifiedBy
 You create a new Spring initializer for each case study
 it will be easy to maintain
 For all the class create the Lombok getter and setter
 For BaseModel, in the ID , define with annotation id and Generated value . Else it will show the error at the time of DB Creation
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 We need to defined MappedSuperClass as this is the super class for all the classes




 User
 THis is the model user
 It has phonenumber, name and password

 ExpenseType
 Enum: Actual, Dummy Actual is the txn made for the expense . In this case, A has paid to the vendor Rs. 500 . Dummy is the expense from B has to pay to A ( which is internal )

 Group
 This is the model to have the list of users for that group
 Attr. Name
 Attr. Description
 Attr. List<User>
 Attr. User createBy ( this is the admin of this Group)
 Attr. List<Expense>


 Expense
 This is the expense class
 FOr ex. For A and B in the group , expense is made and paid by A
 For eg. Dinner , 500 and paid by A
 So A, Paid, +500
 Share of B will be B , HadToPay,-500
 Attr.Description - Short description about the Expense
 Attr.User  - Who has created this expense
 Attr.ListOfExpenseUser - List of expense for each user. For ex A paid 500 , B has to pay 500. So for this expense , We have two expenseUser object
 Attr.ExpenseType - Actual or Dummy.
 Attr.Group - for each expense we should know which group it is . For Eg. AptFriendsExpense, GoaTrip Likewise



 ExpenseUser
 This model is for the each user , how much he has to give or need to get
 For ex. If the expense is made for 500, between A and B , for dinner
 A paid 500
 B has to Pay 500
 For this expense, we have two expense User ( Expense w.r.t to that user ) . A,Paid,500 and B, HasToPay,500
 This has to be marked as Entity because this will be stored in the Db
 Attr: Expense
 Attr: User
 Attr: amount
 Attr: ExpenseUserType ( this is different Enum: HadToPay, Paid)


All the Models are done.
Now we need to define the cardinalities

 User
 ExpenseType
 Group
 Expense
 ExpenseUser
 ExpenseType
 ExpenseUserType



 