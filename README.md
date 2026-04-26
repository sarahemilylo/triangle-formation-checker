# 📐 Triangle Formation Checker

## 📝 Description
This is a simple Java Swing GUI program that checks whether three side lengths can form a triangle.

The user enters three side lengths, and the program determines if a valid triangle can be created. If the triangle is valid, the program calculates the area using **Heron’s Formula**. If the sides cannot form a triangle, an error message is displayed.

<img width="1593" height="850" alt="triangle_formation_calculator_interface" src="https://github.com/user-attachments/assets/1b612d2e-074d-48be-8a4d-418747a7f497" />

---

## ⚙️ Features
- 🔢 Input three side lengths
- ✅ Checks if a triangle can be formed
- 📐 Calculates area using Heron’s Formula
- 🖥️ Simple Java Swing GUI
- 📢 Displays either the triangle area or an error message

---

## 🧮 Formula Used
The program uses **Heron’s Formula**:

```text
s = (a + b + c) / 2

Area = √[s(s - a)(s - b)(s - c)]
