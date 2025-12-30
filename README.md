# 🗨️ Multi-Client Chat Application (Java)

A console-based **Multi-Client Chat Application** built using **Core Java**, allowing multiple clients to connect to a central server and communicate in real time. This project demonstrates **socket programming**, **multithreading**, and a **client–server architecture**.

---

## 📌 Features

- Multiple clients can connect simultaneously
- Real-time message broadcasting
- Separate thread for each client
- Handles client join and disconnect gracefully
- Console-based and lightweight
- Clean separation of server and client logic

---

## 🛠️ Tech Stack

- **Language:** Java (Core Java)
- **Networking:** Socket Programming
- **Concurrency:** Multithreading
- **I/O:** BufferedReader, PrintWriter
- **Collections:** List / Set
- **IDE:** VS Code / IntelliJ IDEA
- **Platform:** Console Application

---

## 🏗️ Architecture
+---------+ |
| Client | |
+---------+ |
---> Central Server ---> Broadcast Messages
+---------+ |
| Client | |
+---------+ |


## 📂 Project Structure (Logical)
multi-client-chat/
├── server
│ ├── Server logic
│ └── Client handler
├── client
│ └── Client program
└── README.md


---

## ▶️ How the Application Works

1. Server starts and waits for client connections
2. Clients connect to the server using sockets
3. Each client runs in its own thread
4. Messages sent by one client are broadcast to others
5. Server removes clients upon disconnection

---

## 📚 Learning Outcomes

- Deep understanding of client–server communication
- Hands-on experience with Java sockets
- Practical use of multithreading
- Handling shared resources in concurrent applications
- Designing scalable console-based systems

---

## 🚀 Possible Enhancements


- Private (one-to-one) messaging
- GUI using JavaFX or Swing
- Message timestamps
- Persistent chat history (file or database)
- Secure communication using encryption

---

## 📈 Project Level

**Beginner to Intermediate**


- College mini-projects
- Networking and multithreading demonstrations
- Core Java portfolio projects

---

## 👨‍💻 Author

**Ajay**  
Java Developer | Core Java | OOP | DSA  
GitHub: https://github.com/avishaleswars-debug

---


