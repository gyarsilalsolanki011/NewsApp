# 🗞️ NewsApp — Modern Clean Architecture Android App

![Kotlin](https://img.shields.io/badge/Kotlin-1.9-blue?logo=kotlin)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-UI-green?logo=android)
![Retrofit](https://img.shields.io/badge/Retrofit-Networking-orange)
![Room](https://img.shields.io/badge/Room-Database-yellow)
![Hilt](https://img.shields.io/badge/Hilt-DI-blue)
![License](https://img.shields.io/badge/License-MIT-blue)

> 📰 **NewsApp** is a fully functional, offline-capable Android news reader built using **Jetpack Compose**, **MVVM**, and **Clean Architecture**.  
> It integrates **Retrofit**, **Room**, and **Hilt**, offering a modular, testable, and scalable project setup.

---

## 🚀 Features

- 🧠 **Clean Architecture (Data–Domain–Presentation)**  
- 📲 **Jetpack Compose UI** with Material 3  
- 🌐 **News API integration** using Retrofit  
- 💾 **Offline caching** with Room database  
- 🔍 **Search news articles** by title or keyword  
- 🧭 **Modular Navigation** with Compose NavHost  
- 🌗 **Dark/Light theme support**  
- 🔐 **Serializable models** for navigation safety  

---

## 🧩 Tech Stack
- Language: Kotlin
- Architecture: Clean Architecture + MVVM
- UI: Jetpack Compose, Material 3
- Network: Retrofit, OkHttp Interceptors
- Database: Room
- Dependency Injection (DI): Hilt
- Image Loading: Coil
- Serialization: Kotlinx Serialization

---

## 🗂️ Project Structure
```markdown
com.gyarsilalsolabki011.newsapp/
│
├── data/
│ ├── local/ # Room DB, DAOs, Entities
│ ├── manager/ # DataStore or Preference Manager
│ ├── remote/ # API, DTOs, Interceptors, Pagination
│ └── repository/ # Repository implementations
│
├── di/ # Hilt/Koin dependency injection modules
│
├── domain/
│ ├── manager/ # Domain-level managers (if any)
│ ├── models/ # Core models (Article, Source)
│ ├── repository/ # Repository interfaces
│ └── usecases/ # Use case classes (app_entry, news)
│
├── presentation/
│ ├── bookmark/ # Bookmark screen
│ ├── common/ # Shared composables
│ ├── details/ # Article details screen
│ ├── home/ # Home and headlines UI
│ ├── mainActivity/ # Main launcher activity
│ ├── navigation/ # App navigation graph
│ ├── news_navigation/ # News-specific navigation
│ ├── onboarding/ # Onboarding flow
│ ├── search/ # Search screen
│ └── Dimens/ # Spacing, dimensions
│
├── ui.theme/ # Colors, Typography, Shapes
├── utils/ # Extensions, constants, helpers
└── NewsApp.kt # Application entry point
```
---

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

---

## 🧠 Architecture Overview

```
graph TD
    UI[🧩 UI Layer\n(Jetpack Compose)] --> Presentation[🎨 Presentation Layer\n(ViewModels, UI States)]
    Presentation --> Domain[⚙️ Domain Layer\n(UseCases, Models)]
    Domain --> Data[💾 Data Layer\n(Repository)]
    Data --> Remote[🌐 Remote Source\n(Retrofit, API)]
    Data --> Local[📁 Local Source\n(Room, DataStore)]

    %% Styling
    style UI fill:#82caff,stroke:#0b3d91,stroke-width:2px,color:#fff
    style Presentation fill:#74b9ff,stroke:#0652DD,stroke-width:2px,color:#fff
    style Domain fill:#55efc4,stroke:#00b894,stroke-width:2px,color:#fff
    style Data fill:#ffeaa7,stroke:#f0932b,stroke-width:2px,color:#000
    style Remote fill:#fab1a0,stroke:#d63031,stroke-width:2px,color:#000
    style Local fill:#fdcb6e,stroke:#e17055,stroke-width:2px,color:#000
```

---

## 📸 Screenshots
> *(will add app screenshots here)*  

| Home Screen | Article Details | Saved Articles |
|--------------|----------------|----------------|
| ![Home](assets/home.png) | ![Details](assets/details.png) | ![Saved](assets/saved.png) |

