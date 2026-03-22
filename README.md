# BOCRA Digital Platform
### Developed by Ironclad Systems
#### BOCRA Website Development Hackathon | March 2026

---

## Overview

The BOCRA Digital Platform is a modern, secure, and accessible web application developed for the Botswana Communications Regulatory Authority (BOCRA). The platform transforms BOCRA's digital presence from a static information website into a fully integrated regulatory service delivery system.

The solution directly addresses BOCRA's mandate to deliver efficient, transparent, and citizen-centric regulatory services by enabling self-service, real-time analytics, system integration, and enhanced public engagement.

---

## Live Demo

> 🔗 **[Live URL — Coming Soon]**
>
> API Documentation: `[Live URL]/swagger-ui.html`

---

## The Problem We Solved

BOCRA's current platform has critical gaps that prevent effective service delivery:

| Problem | Impact |
|---|---|
| No online complaint submission | Citizens must physically visit offices or send a fax |
| No complaint tracking system | Citizens cannot check the status of their complaint |
| No online licensing portal | Licensees travel to Gaborone for every application |
| No searchable document library | Regulatory publications are difficult to find |
| No mobile responsive design | Majority of Batswana access internet via mobile |
| No real-time analytics | BOCRA has no visibility into platform performance |
| No domain registry lookup | Citizens cannot check .BW domain availability online |

---

## Our Solution

A fully integrated digital regulatory platform built on enterprise-grade technology that delivers:

- **Citizen Complaint Portal** — Online complaint submission with automatic reference number generation and real-time status tracking
- **Online Licensing Portal** — Digital licence applications and renewals for all BOCRA licence types
- **Searchable Publications Library** — Full-text search across all regulatory documents, acts, and publications
- **Domain Registry Lookup** — Real-time .BW domain availability and registration details
- **Admin Analytics Dashboard** — Live statistics and data visualizations for BOCRA staff
- **Consumer Protection Section** — Plain-language consumer rights information and citizen rights guidance
- **Cybersecurity Advisory** — National cybersecurity guidance and incident awareness
- **Mobile-First Design** — Fully responsive, WCAG 2.1 AA accessible interface

---

## Tech Stack

### Frontend
- React 18 (Vite)
- Tailwind CSS + shadcn/ui
- Recharts (Analytics)
- Axios
- React Router v6

### Backend
- Spring Boot 3.x (Java 21)
- Spring Security + JWT Authentication
- Spring Data JPA + Hibernate
- PostgreSQL 15
- Redis (Caching)
- SpringDoc OpenAPI 3 (Swagger)

### Infrastructure
- Docker + Docker Compose
- GitHub Actions CI/CD
- Render / Railway (Cloud Deployment)

---

## How to Run Locally

### Prerequisites
- Java 21+
- Maven 3.8+
- Node.js 18+
- Docker Desktop

### 1. Clone the Repository

```bash
git clone https://github.com/Ironclad-Systems/bocra-website.git
cd bocra-website
```

### 2. Start the Database

```bash
docker-compose up -d
```

### 3. Run the Backend

```bash
cd backend
mvn spring-boot:run
```

- API runs at: `http://localhost:8080`
- Swagger UI at: `http://localhost:8080/swagger-ui.html`

### 4. Run the Frontend

```bash
cd frontend
npm install
npm run dev
```

- Application runs at: `http://localhost:5173`

---

## API Endpoints

| Module | Endpoint | Description |
|---|---|---|
| Auth | `POST /api/auth/register` | Register a new user |
| Auth | `POST /api/auth/login` | Login and receive JWT token |
| Complaints | `POST /api/complaints/submit` | Submit a new complaint |
| Complaints | `GET /api/complaints/track/{ref}` | Track complaint by reference number |
| Complaints | `GET /api/complaints/all` | Get all complaints (Admin) |
| Licensing | `POST /api/licenses/apply` | Apply for a new licence |
| Licensing | `GET /api/licenses/{licenseNumber}` | Look up a licence |
| Publications | `GET /api/publications` | Get all publications |
| Publications | `GET /api/publications/search?keyword=` | Search publications |
| Domain | `GET /api/domains/lookup/{domainName}` | Check domain availability |
| Admin | `GET /api/admin/stats` | Get platform analytics |

---

## Project Structure

```
bocra-website/
├── backend/                    ← Spring Boot API
│   ├── src/main/java/
│   │   └── bw/bocra/ironclad/
│   │       ├── auth/           ← JWT Authentication
│   │       ├── user/           ← User management
│   │       ├── complaint/      ← Complaint module
│   │       ├── license/        ← Licensing module
│   │       ├── publication/    ← Publications module
│   │       ├── domain/         ← Domain registry
│   │       ├── admin/          ← Analytics & stats
│   │       └── config/         ← Security & OpenAPI
│   └── pom.xml
├── frontend/                   ← React application
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   └── store/
│   └── package.json
├── proposal/                   ← Technical proposal documents
├── docker-compose.yml
└── README.md
```

---

## Submission Details

| Item | Detail |
|---|---|
| Team | Ironclad Systems |
| Hackathon | BOCRA Website Development Hackathon |
| Submission Platform | BDIH Skillsranker |
| Submission Email | hackathon@bih.co.bw |
| Deadline | 27 March 2026 at 17:00hrs CAT |

---

> **Ironclad Systems** — *Built for Botswana. Built to last.*
