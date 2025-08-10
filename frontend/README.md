# ⚽ Soccer Standings Frontend

A React TypeScript application for displaying La Liga football standings with real-time data from the Spring Boot backend.

## 🚀 Quick Start

```bash
# Install dependencies
npm install

# Start development server (http://localhost:3000)
npm start

# Build for production
npm run build

# Run tests
npm test

# Lint code
npm run lint

# Auto-fix linting issues
npm run lint:fix
```

## 🏗️ Tech Stack

- **React 19** - Modern React with hooks
- **TypeScript** - Type-safe JavaScript
- **CSS3** - Custom styles with responsive design
- **Testing Library** - React component testing
- **ESLint** - Code linting and formatting

## 📁 Project Structure

```
src/
├── components/           # Reusable React components
│   ├── StandingsTable.tsx   # Main standings table
│   └── StandingsTable.css   # Component styles
├── services/            # API communication
│   └── api.ts              # Backend API client
├── types/               # TypeScript definitions
│   └── standings.ts        # Data type definitions
├── App.tsx              # Root component
├── index.tsx            # Application entry point
└── setupTests.ts        # Test configuration
```

## 🎨 Features

- **Real-time standings** - Fetches live La Liga data
- **Responsive design** - Works on desktop and mobile
- **Team crests** - Displays official team logos
- **Loading states** - User-friendly loading indicators
- **Error handling** - Graceful error management
- **Type safety** - Full TypeScript support

## 🔗 API Integration

The frontend communicates with the Spring Boot backend:

```typescript
// Fetch standings data
const data = await api.getLaLigaStandings();
```

**Backend endpoint:** `GET http://localhost:8080/standings/laliga`

## 🧪 Testing

```bash
# Run tests in watch mode
npm test

# Run tests with coverage
npm test -- --coverage --watchAll=false

# Run specific test file
npm test StandingsTable.test.tsx
```

## 📦 Production Build

```bash
# Create optimized production build
npm run build

# Serve locally (requires serve package)
npm install -g serve
serve -s build
```

## 🛠️ Development

### Code Quality
- **ESLint** configured with React and TypeScript rules
- **Prettier** for consistent code formatting (via ESLint)
- **React Testing Library** for component testing

### Environment Variables
Create `.env` file for configuration:
```
REACT_APP_API_URL=http://localhost:8080
```

### Styling
- Modern CSS with flexbox and grid
- Responsive breakpoints for mobile/desktop
- Team-based color coding for standings positions

## 🚢 Deployment

Build artifacts are generated in `build/` folder:
- Static HTML, CSS, and JavaScript files
- Ready for deployment to any static hosting service
- Works with Netlify, Vercel, GitHub Pages, etc.

## 🤝 Contributing

1. Follow the existing code style
2. Write tests for new components
3. Ensure linting passes: `npm run lint`
4. All tests should pass: `npm test`
