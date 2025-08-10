# ⚽ Soccer Standings Hub

A full-stack application for displaying La Liga football standings with a Spring Boot backend and React frontend.

## 🏗️ Architecture

- **Backend**: Spring Boot (Java 17) with WebFlux
- **Frontend**: React 19 with TypeScript
- **Build Tools**: Gradle + npm
- **Code Quality**: Spotless, ESLint, Lombok
- **CI/CD**: GitHub Actions

## 🚀 Quick Start

### Backend (Spring Boot)
```bash
# Run the API server
./gradlew bootRun

# Build JAR
./gradlew build

# Run tests
./gradlew test

#Fix formatting
./gradlew spotlessCheck

# Check code formatting
./gradlew spotlessCheck
```

### Frontend (React)
```bash
cd frontend

# Install dependencies
npm install

# Start development server
npm start

# Build for production
npm run build

# Run tests
npm test

# Lint code
npm run lint
```

## 🛠️ Development

### Requirements
- Java 17+
- Node.js 18+
- Football-data.org API token (optional for live data)

### Project Structure
```
soccer/
├── src/main/java/              # Spring Boot backend
│   ├── controllers/           # REST endpoints
│   ├── services/             # Business logic  
│   ├── dtos/                # Data transfer objects (Lombok)
│   └── config/              # CORS & API configuration
├── frontend/                 # React TypeScript app
│   ├── src/components/      # React components
│   ├── src/services/       # API client
│   └── src/types/         # TypeScript definitions
└── .github/workflows/      # CI/CD pipeline
```

### API Endpoints
- `GET /standings/laliga` - Fetch current La Liga standings

### Code Quality Tools
- **Spotless**: Automatic Java code formatting (Google Java Format)
- **Lombok**: Eliminates DTO boilerplate (82% code reduction)
- **ESLint**: JavaScript/TypeScript linting
- **GitHub Actions**: Automated testing and formatting checks

## 🔒 Security

- CORS configured for secure cross-origin requests
- Only GET/OPTIONS methods allowed from frontend
- API tokens stored in environment variables

## 🚢 Deployment

The application builds to:
- JAR file for Spring Boot backend
- Static files for React frontend

Both can be deployed to any cloud platform supporting Java and static hosting.

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes (formatting will be checked automatically)
4. Submit a pull request

The CI/CD pipeline will automatically check code quality and run tests.
