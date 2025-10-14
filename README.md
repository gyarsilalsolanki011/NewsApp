# 🗞️ NewsApp — Modern Clean Architecture Android App

![Kotlin](https://img.shields.io/badge/Kotlin-1.9-blue?logo=kotlin)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-UI-green?logo=android)
![Retrofit](https://img.shields.io/badge/Retrofit-Networking-orange)
![Room](https://img.shields.io/badge/Room-Database-yellow)
![Hilt](https://img.shields.io/badge/Hilt-DI-blue)
![License](https://img.shields.io/badge/License-MIT-blue)

> 📰 **NewsApp** is a fully functional, offline-capable Android news reader built using **Jetpack Compose**, **MVVM**, and **Clean Architecture**.  
> It integrates **Retrofit**, **Room**, and **Hilt**, offering a modular, testable, and scalable project setup.

<br>

## 🚀 Features

- 🧠 **Clean Architecture (Data–Domain–Presentation)**  
- 📲 **Jetpack Compose UI** with Material 3  
- 🌐 **News API integration** using Retrofit  
- 💾 **Offline caching** with Room database  
- 🔍 **Search news articles** by title or keyword  
- 🧭 **Modular Navigation** with Compose NavHost  
- 🌗 **Dark/Light theme support**  
- 🔐 **Serializable models** for navigation safety  

<br>

## 🧩 Tech Stack
1. ***`Language`:*** Kotlin
2. ***`Architecture`:*** Clean Architecture + MVVM
3. ***`UI`:*** Jetpack Compose, Material 3
4. ***`Network`:*** Retrofit, OkHttp Interceptors
5. ***`Database`:*** Room
6. ***`Dependency Injection (DI)`:*** Hilt
7. ***`Image Loading`:*** Coil
8. ***`Serialization`:*** Kotlinx Serialization

<br>

## 🗂️ Project Structure
```markdown
com.gyarsilalsolabki011.newsapp/
│
├── data/
│ ├── local/                   # Room DB, DAOs, Entities
│ ├── manager/                 # Manager Implementations
│ ├── remote/                  # API, DTOs, Interceptors, Pagination
│ └── repository/              # Repository implementations
│
├── di/                        # Hilt/Koin dependency injection modules
│
├── domain/
│ ├── manager/                 # DataStore or Preference Manager
│ ├── models/                  # Core models (Article, Source)
│ ├── repository/              # Repository interfaces
│ └── usecases/                # Use case classes (app_entry, news)
│
├── presentation/
│ ├── bookmark/                # Bookmark screen
│ ├── common/                  # Shared composables
│ ├── details/                 # Article details screen
│ ├── home/                    # Home and headlines UI
│ ├── mainActivity/            # Main launcher activity
│ ├── navigation/              # App navigation graph
│ ├── news_navigation/         # News-specific navigation
│ ├── onboarding/              # Onboarding flow
│ ├── search/                  # Search screen
│ └── Dimens/                  # Spacing, dimensions
│
├── ui.theme/                  # Colors, Typography, Shapes
├── utils/                     # Extensions, constants, helpers
└── NewsApp.kt                 # Application entry point
```

<br>

## ⚙️ Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/gyarsilalsolanki011/NewsApp.git
   ```
2. Add API key
   - Obtain an API key from https://newsapi.org
   - Place it in your local.properties or constants file:
   ```kotlin
   const val API_KEY = "YOUR_API_KEY"
   ```
3. Build & Run
   - Open in Android Studio (Arctic Fox or later)
   - Click ▶️ Run

<br>

## 🧠 Architecture Overview

```mermaid
graph TD
    UI["🧩 UI Layer<br>(Jetpack Compose)"] --> Presentation["🎨 Presentation Layer<br>(ViewModels, UI States)"]
    Presentation --> Domain["⚙️ Domain Layer<br>(UseCases, Models)"]
    Domain --> Data["💾 Data Layer<br>(Repository)"]
    Data --> Remote["🌐 Remote Source<br>(Retrofit, API)"]
    Data --> Local["📁 Local Source<br>(Room, DataStore)"]

    %% Styling
    style UI fill:#82caff,stroke:#0b3d91,stroke-width:2px,color:#fff
    style Presentation fill:#74b9ff,stroke:#0652DD,stroke-width:2px,color:#fff
    style Domain fill:#55efc4,stroke:#00b894,stroke-width:2px,color:#fff
    style Data fill:#ffeaa7,stroke:#f0932b,stroke-width:2px,color:#000
    style Remote fill:#fab1a0,stroke:#d63031,stroke-width:2px,color:#000
    style Local fill:#fdcb6e,stroke:#e17055,stroke-width:2px,color:#000
```

<br>

## 📸 Screenshots 

## 📱 App Screenshots

| Home Screen                           | Search Screen                             | Article Details                             | Saved Articles                          |
|---------------------------------------|-------------------------------------------|---------------------------------------------|-----------------------------------------|
| ![Home](.github/images/home.png)      | ![Search](.github/images/search.png)      | ![Details](.github/images/details.png)      | ![Saved](.github/images/saved.png)      |
| ![Home](.github/images/home_dark.png) | ![Search](.github/images/search_dark.png) | ![Details](.github/images/details_dark.png) | ![Saved](.github/images/saved_dark.png) |


> [!NOTE]
> *(will add app screenshots here)* 

<br>

## 📜 License

This project is licensed under the [`MIT-License`](LICENSE) License.

<br>

## 👨‍💻 Developer  
**`Gyarsilal Solanki`**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230A66C2.svg?logo=LinkedIn&logoColor=white)](https://www.linkedin.com/in/gyarsilal-solanki)  🤝  [![GitHub](https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=white)](https://github.com/gyarsilalsolanki011)

  
**`Need Help!`**, Join us: 

[![GitHub Discussions](https://img.shields.io/badge/GitHub-Discussions-181717?logo=github&style=flat-square)](https://github.com/eleven-dev-cafe/cafe-talks/discussions)   

---

***If you find this project helpful, consider giving it a ⭐ to support!***

