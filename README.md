---

### ⚽ **La Liga Standings 2024/25**  
A simple API to fetch and display the latest **La Liga** standings for the **2024/25** season.

---

## 🌍 **League Information**
| Competition | Country | Code | Start Date | End Date |
|------------|---------|------|------------|------------|
| ![La Liga](https://crests.football-data.org/laliga.png) **Primera Division** | 🇪🇸 Spain | PD | **August 18, 2024** | **May 25, 2025** |

---

## 📊 **Current Standings** (Matchday 24)
| Position | Team | Crest | Played | Won | Draw | Lost | Points | Goals For | Goals Against | Goal Difference |
|----------|------|------|--------|------|------|------|--------|-----------|--------------|----------------|
| 1️⃣ | ![Real Madrid](https://crests.football-data.org/86.png) **Real Madrid CF** | 23 | 15 | 5 | 3 | 50 | 51 | 22 | +29 |
| 2️⃣ | ![Atleti](https://crests.football-data.org/78.png) **Atlético Madrid** | 23 | 14 | 7 | 2 | 49 | 38 | 15 | +23 |
| 3️⃣ | ![Barça](https://crests.football-data.org/81.png) **FC Barcelona** | 23 | 15 | 3 | 5 | 48 | 64 | 25 | +39 |
| 4️⃣ | ![Athletic Club](https://crests.football-data.org/77.png) **Athletic Club** | 23 | 12 | 8 | 3 | 44 | 36 | 20 | +16 |
| 5️⃣ | ![Villarreal](https://crests.football-data.org/94.png) **Villarreal CF** | 23 | 11 | 7 | 5 | 40 | 46 | 34 | +12 |
| 6️⃣ | ![Rayo Vallecano](https://crests.football-data.org/87.png) **Rayo Vallecano** | 23 | 9 | 8 | 6 | 35 | 27 | 24 | +3 |

🔗 **Full standings available in the API response.**  

---

## 🛠 **How to Use the API**
### 📥 **Get Current Standings**
**Endpoint:**  
```http
GET /standings/laliga
```
**Response Example:**
```json
{
    "Real Madrid CF": 50,
    "Club Atlético de Madrid": 49,
    "FC Barcelona": 48,
    "Athletic Club": 44,
    "Villarreal CF": 40,
    "Rayo Vallecano de Madrid": 35
}
```

---

## 🚀 **Running Locally**
### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/yourusername/soccer-standings.git
cd soccer-standings
```
### **2️⃣ Run the Application**
```sh
./gradlew bootRun
```
### **3️⃣ Open in Browser**
```
http://localhost:8080/standings/laliga
```

---

## 📌 **Upcoming Features**
- ✅ **Live score updates**  
- ✅ **Team statistics**  
- ✅ **Player rankings**  

🚀 **Contributions are welcome!** Fork this repo and submit a PR.

---

Let me know if you want any modifications! 🚀⚽
