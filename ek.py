# import mysql.connector

# # ---------------- DATABASE CONNECTION ----------------
# conn = None
# cursor = None

# try:
#     conn = mysql.connector.connect(
#         host="localhost",
#         user="root",
#         password="",
#         database="bank"
#     )
#     cursor = conn.cursor()
#     print("Connected to Database")
# except Exception as e:
#     print("Database Connection Failed:", e)


# # ---------------- OOP CLASSES ----------------
# class Account:
#     def __init__(self, acc_no, name, balance):
#         self.acc_no = acc_no
#         self.name = name
#         self.balance = balance

#     def deposit(self, amount):
#         self.balance += amount

#     def withdraw(self, amount):
#         if amount > self.balance:
#             raise Exception("Insufficient Balance")
#         self.balance -= amount


# class SavingsAccount(Account):
#     def calculate_interest(self):
#         return self.balance * 0.04


# # ---------------- COMMON HELPERS ----------------
# def is_db_ready():
#     if conn is None or cursor is None:
#         print("Database not connected. Please check MySQL settings.")
#         return False
#     return True


# # ---------------- CRUD OPERATIONS ----------------

# def create_account():
#     if not is_db_ready():
#         return
#     try:
#         acc_no = int(input("Enter Account No: "))
#         name = input("Enter Name: ")
#         balance = float(input("Enter Balance: "))

#         cursor.execute(
#             "INSERT INTO accounts VALUES (%s, %s, %s)",
#             (acc_no, name, balance)
#         )
#         conn.commit()
#         print("Account Created")

#     except Exception as e:
#         conn.rollback()
#         print("Error:", e)


# def view_account():
#     if not is_db_ready():
#         return
#     try:
#         cursor.execute("SELECT * FROM accounts")
#         data = cursor.fetchall()

#         for row in data:
#             print(row)

#     except Exception as e:
#         print("Error:", e)


# def deposit_money():
#     if not is_db_ready():
#         return
#     try:
#         acc_no = int(input("Enter Account No: "))
#         amount = float(input("Enter Amount: "))

#         cursor.execute(
#             "UPDATE accounts SET balance = balance + %s WHERE acc_no = %s",
#             (amount, acc_no)
#         )
#         if cursor.rowcount == 0:
#             conn.rollback()
#             print("Account not found")
#             return

#         conn.commit()
#         print("Amount Deposited")

#     except Exception as e:
#         conn.rollback()
#         print("Error:", e)


# def withdraw_money():
#     if not is_db_ready():
#         return
#     try:
#         acc_no = int(input("Enter Account No: "))
#         amount = float(input("Enter Amount: "))

#         cursor.execute("SELECT balance FROM accounts WHERE acc_no = %s", (acc_no,))
#         result = cursor.fetchone()

#         if not result:
#             print("Account not found")
#             return

#         if result[0] < amount:
#             raise Exception("Insufficient Balance")

#         cursor.execute(
#             "UPDATE accounts SET balance = balance - %s WHERE acc_no = %s",
#             (amount, acc_no)
#         )
#         conn.commit()
#         print("Amount Withdrawn")

#     except Exception as e:
#         conn.rollback()
#         print("Error:", e)


# def delete_account():
#     if not is_db_ready():
#         return
#     try:
#         acc_no = int(input("Enter Account No: "))

#         cursor.execute("DELETE FROM accounts WHERE acc_no = %s", (acc_no,))
#         if cursor.rowcount == 0:
#             conn.rollback()
#             print("Account not found")
#             return

#         conn.commit()
#         print("Account Deleted")

#     except Exception as e:
#         conn.rollback()
#         print("Error:", e)


# # ---------------- TRANSACTION HANDLING ----------------
# def transfer_money():
#     if not is_db_ready():
#         return
#     try:
#         from_acc = int(input("From Account: "))
#         to_acc = int(input("To Account: "))
#         amount = float(input("Amount: "))

#         if from_acc == to_acc:
#             raise Exception("Source and destination accounts must be different")

#         cursor.execute("SELECT balance FROM accounts WHERE acc_no = %s", (from_acc,))
#         sender = cursor.fetchone()

#         cursor.execute("SELECT balance FROM accounts WHERE acc_no = %s", (to_acc,))
#         receiver = cursor.fetchone()

#         if not sender:
#             raise Exception("Source account not found")
#         if not receiver:
#             raise Exception("Destination account not found")
#         if sender[0] < amount:
#             raise Exception("Insufficient Balance")

#         cursor.execute(
#             "UPDATE accounts SET balance = balance - %s WHERE acc_no = %s",
#             (amount, from_acc)
#         )
#         cursor.execute(
#             "UPDATE accounts SET balance = balance + %s WHERE acc_no = %s",
#             (amount, to_acc)
#         )

#         conn.commit()
#         print("Transaction Successful")

#     except Exception as e:
#         conn.rollback()
#         print("Transaction Failed:", e)


# # ---------------- MENU ----------------
# while True:
#     print("\n====== Banking System ======")
#     print("1. Create Account")
#     print("2. View Accounts")
#     print("3. Deposit")
#     print("4. Withdraw")
#     print("5. Transfer")
#     print("6. Delete Account")
#     print("7. Exit")

#     ch = input("Enter choice: ")

#     if ch == '1':
#         create_account()
#     elif ch == '2':
#         view_account()
#     elif ch == '3':
#         deposit_money()
#     elif ch == '4':
#         withdraw_money()
#     elif ch == '5':
#         transfer_money()
#     elif ch == '6':
#         delete_account()
#     elif ch == '7':
#         break
#     else:
#         print("Invalid choice")

# if conn is not None and conn.is_connected():
#     cursor.close()
#     conn.close()
# import subprocess
# import sys

# try:
#     import mysql.connector
# except ModuleNotFoundError:
#     print("mysql-connector-python not found. Installing in current interpreter...")
#     subprocess.check_call(
#         [sys.executable, "-m", "pip", "install", "mysql-connector-python"]
#     )
#     import mysql.connector

# # ---------------- DATABASE CONNECTION ----------------
# conn = None
# cursor = None

# try:
#     conn = mysql.connector.connect(
#         host="localhost",
#         user="root",
#         password="",
#         database="bank"
#     )
#     cursor = conn.cursor()
#     print("Connected to Database")
# except Exception as e:
#     print("Database Connection Failed:", e)


# # ---------------- OOP CLASSES ----------------
# class Account:
#     def __init__(self, acc_no, name, balance):
#         self.acc_no = acc_no
#         self.name = name
#         self.balance = balance

#     def deposit(self, amount):
#         self.balance += amount

#     def withdraw(self, amount):
#         if amount > self.balance:
#             raise Exception("Insufficient Balance")
#         self.balance -= amount


# class SavingsAccount(Account):
#     def calculate_interest(self):
#         return self.balance * 0.04


# # ---------------- COMMON HELPERS ----------------
# def is_db_ready():
#     if conn is None or cursor is None:
#         print("Database not connected. Please check MySQL settings.")
#         return False
#     return True


# # ---------------- CRUD OPERATIONS ----------------

# def create_account():
#     if not is_db_ready():
#         return
#     try:
#         acc_no = input("Enter Account No: ").strip()
#         name = input("Enter Name: ")
#         balance = float(input("Enter Balance: "))

#         cursor.execute(
#             "INSERT INTO accounts (acc_no, name, balance) VALUES (%s, %s, %s)",
#             (acc_no, name, balance)
#         )
#         conn.commit()
#         print("Account Created")

#     except Exception as e:
#         conn.rollback()
#         print("Error:", e)


# def view_account():
#     if not is_db_ready():
#         return
#     try:
#         cursor.execute("SELECT * FROM accounts")
#         data = cursor.fetchall()

#         if not data:
#             print("No accounts found")
#             return

#         print("\nACC_NO\tNAME\tBALANCE")
#         for row in data:
#             print(f"{row[0]}\t{row[1]}\t{row[2]}")

#     except Exception as e:
#         print("Error:", e)


# def deposit_money():
#     if not is_db_ready():
#         return
#     try:
#         acc_no = input("Enter Account No: ").strip()
#         amount = float(input("Enter Amount: "))

#         cursor.execute(
#             "UPDATE accounts SET balance = balance + %s WHERE acc_no = %s",
#             (amount, acc_no)
#         )
#         if cursor.rowcount == 0:
#             conn.rollback()
#             print("Account not found")
#             return

#         conn.commit()
#         print("Amount Deposited")

#     except Exception as e:
#         conn.rollback()
#         print("Error:", e)


# def withdraw_money():
#     if not is_db_ready():
#         return
#     try:
#         acc_no = input("Enter Account No: ").strip()
#         amount = float(input("Enter Amount: "))

#         cursor.execute("SELECT balance FROM accounts WHERE acc_no = %s", (acc_no,))
#         result = cursor.fetchone()

#         if not result:
#             print("Account not found")
#             return

#         if result[0] < amount:
#             raise Exception("Insufficient Balance")

#         cursor.execute(
#             "UPDATE accounts SET balance = balance - %s WHERE acc_no = %s",
#             (amount, acc_no)
#         )
#         conn.commit()
#         print("Amount Withdrawn")

#     except Exception as e:
#         conn.rollback()
#         print("Error:", e)


# def delete_account():
#     if not is_db_ready():
#         return
#     try:
#         acc_no = input("Enter Account No: ").strip()

#         cursor.execute("DELETE FROM accounts WHERE acc_no = %s", (acc_no,))
#         if cursor.rowcount == 0:
#             conn.rollback()
#             print("Account not found")
#             return

#         conn.commit()
#         print("Account Deleted")

#     except Exception as e:
#         conn.rollback()
#         print("Error:", e)


# # ---------------- TRANSACTION HANDLING ----------------
# def transfer_money():
#     if not is_db_ready():
#         return
#     try:
#         from_acc = input("From Account: ").strip()
#         to_acc = input("To Account: ").strip()
#         amount = float(input("Amount: "))

#         if from_acc == to_acc:
#             raise Exception("Source and destination accounts must be different")

#         cursor.execute("SELECT balance FROM accounts WHERE acc_no = %s", (from_acc,))
#         sender = cursor.fetchone()

#         cursor.execute("SELECT balance FROM accounts WHERE acc_no = %s", (to_acc,))
#         receiver = cursor.fetchone()

#         if not sender:
#             raise Exception("Source account not found")
#         if not receiver:
#             raise Exception("Destination account not found")
#         if sender[0] < amount:
#             raise Exception("Insufficient Balance")

#         cursor.execute(
#             "UPDATE accounts SET balance = balance - %s WHERE acc_no = %s",
#             (amount, from_acc)
#         )
#         cursor.execute(
#             "UPDATE accounts SET balance = balance + %s WHERE acc_no = %s",
#             (amount, to_acc)
#         )

#         conn.commit()
#         print("Transaction Successful")

#     except Exception as e:
#         conn.rollback()
#         print("Transaction Failed:", e)


# # ---------------- MENU ----------------
# while True:
#     print("\n====== Banking System ======")
#     print("1. Create Account")
#     print("2. View Accounts")
#     print("3. Deposit")
#     print("4. Withdraw")
#     print("5. Transfer")
#     print("6. Delete Account")
#     print("7. Exit")

#     ch = input("Enter choice: ")

#     if ch == '1':
#         create_account()
#     elif ch == '2':
#         view_account()
#     elif ch == '3':
#         deposit_money()
#     elif ch == '4':
#         withdraw_money()
#     elif ch == '5':
#         transfer_money()
#     elif ch == '6':
#         delete_account()
#     elif ch == '7':
#         break
#     else:
#         print("Invalid choice")

# if conn is not None and conn.is_connected():
#     cursor.close()
#     conn.close()

import subprocess
import sys

try:
    import mysql.connector
except ModuleNotFoundError:
    print("mysql-connector-python not found. Installing in current interpreter...")
    subprocess.check_call(
        [sys.executable, "-m", "pip", "install", "mysql-connector-python"]
    )
    import mysql.connector

# ---------------- DATABASE CONNECTION ----------------
conn = None
cursor = None

try:
    conn = mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="bank"
)

    cursor = conn.cursor()
    print("Connected to Database")
except Exception as e:
    print("Database Connection Failed:", e)


# ---------------- OOP CLASSES ----------------
class Account:
    def __init__(self, acc_no, name, balance):
        self.acc_no = acc_no
        self.name = name
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if amount > self.balance:
            raise Exception("Insufficient Balance")
        self.balance -= amount


class SavingsAccount(Account):
    def calculate_interest(self):
        return self.balance * 0.04


# ---------------- COMMON HELPERS ----------------
def is_db_ready():
    if conn is None or cursor is None:
        print("Database not connected. Please check MySQL settings.")
        return False
    return True


# ---------------- CRUD OPERATIONS ----------------

def create_account():
    if not is_db_ready():
        return
    try:
        acc_no = input("Enter Account No: ").strip()
        name = input("Enter Name: ")
        balance = float(input("Enter Balance: "))

        cursor.execute(
            "INSERT INTO accounts (acc_no, name, balance) VALUES (%s, %s, %s)",
            (acc_no, name, balance)
        )
        conn.commit()
        print("Account Created")

    except Exception as e:
        conn.rollback()
        print("Error:", e)


def view_account():
    if not is_db_ready():
        return
    try:
        cursor.execute("SELECT acc_no, name, balance FROM accounts ORDER BY acc_no")
        data = cursor.fetchall()

        if not data:
            print("No accounts found")
            return

        print(f"\n{'ACC_NO':<15}{'NAME':<20}{'BALANCE':>12}")
        print("-" * 47)
        for row in data:
            print(f"{str(row[0]):<15}{str(row[1]):<20}{float(row[2]):>12.2f}")

    except Exception as e:
        print("Error:", e)


def deposit_money():
    if not is_db_ready():
        return
    try:
        acc_no = input("Enter Account No: ").strip()
        amount = float(input("Enter Amount: "))

        cursor.execute(
            "UPDATE accounts SET balance = balance + %s WHERE acc_no = %s",
            (amount, acc_no)
        )
        if cursor.rowcount == 0:
            conn.rollback()
            print("Account not found")
            return

        conn.commit()
        print("Amount Deposited")

    except Exception as e:
        conn.rollback()
        print("Error:", e)


def withdraw_money():
    if not is_db_ready():
        return
    try:
        acc_no = input("Enter Account No: ").strip()
        amount = float(input("Enter Amount: "))

        cursor.execute("SELECT balance FROM accounts WHERE acc_no = %s", (acc_no,))
        result = cursor.fetchone()

        if not result:
            print("Account not found")
            return

        if result[0] < amount:
            raise Exception("Insufficient Balance")

        cursor.execute(
            "UPDATE accounts SET balance = balance - %s WHERE acc_no = %s",
            (amount, acc_no)
        )
        conn.commit()
        print("Amount Withdrawn")

    except Exception as e:
        conn.rollback()
        print("Error:", e)


def delete_account():
    if not is_db_ready():
        return
    try:
        acc_no = input("Enter Account No: ").strip()

        cursor.execute("DELETE FROM accounts WHERE acc_no = %s", (acc_no,))
        if cursor.rowcount == 0:
            conn.rollback()
            print("Account not found")
            return

        conn.commit()
        print("Account Deleted")

    except Exception as e:
        conn.rollback()
        print("Error:", e)


# ---------------- TRANSACTION HANDLING ----------------
def transfer_money():
    if not is_db_ready():
        return
    try:
        from_acc = input("From Account: ").strip()
        to_acc = input("To Account: ").strip()
        amount = float(input("Amount: "))

        if from_acc == to_acc:
            raise Exception("Source and destination accounts must be different")

        cursor.execute("SELECT balance FROM accounts WHERE acc_no = %s", (from_acc,))
        sender = cursor.fetchone()

        cursor.execute("SELECT balance FROM accounts WHERE acc_no = %s", (to_acc,))
        receiver = cursor.fetchone()

        if not sender:
            raise Exception("Source account not found")
        if not receiver:
            raise Exception("Destination account not found")
        if sender[0] < amount:
            raise Exception("Insufficient Balance")

        cursor.execute(
            "UPDATE accounts SET balance = balance - %s WHERE acc_no = %s",
            (amount, from_acc)
        )
        cursor.execute(
            "UPDATE accounts SET balance = balance + %s WHERE acc_no = %s",
            (amount, to_acc)
        )

        conn.commit()
        print("Transaction Successful")

    except Exception as e:
        conn.rollback()
        print("Transaction Failed:", e)


# ---------------- MENU ----------------
while True:
    print("\n====== Banking System ======")
    print("1. Create Account")
    print("2. View Accounts")
    print("3. Deposit")
    print("4. Withdraw")
    print("5. Transfer")
    print("6. Delete Account")
    print("7. Exit")

    ch = input("Enter choice: ")

    if ch == '1':
        create_account()
    elif ch == '2':
        view_account()
    elif ch == '3':
        deposit_money()
    elif ch == '4':
        withdraw_money()
    elif ch == '5':
        transfer_money()
    elif ch == '6':
        delete_account()
    elif ch == '7':
        break
    else:
        print("Invalid choice")

if conn is not None and conn.is_connected():
    cursor.close()
    conn.close()
