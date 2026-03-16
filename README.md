# 🛡️ Ironclad Systems — BOCRA Website Development Hackathon

> **BOCRA Youth Hackathon | 20–27 March 2026**
> Competing for the Development Contract worth **P450,000 (VAT Inc)** + P150,000/year maintenance + 20Mbps LTE internet service.

---

## 📋 Table of Contents

1. [Project Overview](#project-overview)
2. [Team Structure & Roles](#team-structure--roles)
3. [Tech Stack](#tech-stack)
4. [Development Plan (17–27 March)](#development-plan-17--27-march)
5. [Architecture Overview](#architecture-overview)
6. [Repository Structure](#repository-structure)
7. [Getting Started](#getting-started)
8. [Git Workflow & Branching Strategy](#git-workflow--branching-strategy)
9. [Daily Standup Protocol](#daily-standup-protocol)
10. [Submission Checklist](#submission-checklist)
11. [Key Requirements Tracker](#key-requirements-tracker)

---

## Project Overview

**Client:** Botswana Communications Regulatory Authority (BOCRA)
**Objective:** Redesign and rebuild BOCRA's digital platform into a modern, secure, accessible, and integrated regulatory web platform.

### Core Problems We Are Solving

| Problem | Our Solution |
|---|---|
| Poor usability & navigation | Redesigned UX with intuitive information architecture |
| No real-time analytics or dashboards | Admin dashboard with live data visualizations |
| Fragmented system integration | Unified REST API layer connecting licensing, complaints, domain registry |
| No self-service capabilities | Citizen portal with online forms & complaint submission |
| Weak security & compliance | Spring Security + JWT, HTTPS, OWASP-compliant API |
| No mobile accessibility | Fully responsive, WCAG 2.1 AA-compliant React frontend |

---

## Team Structure & Roles

| # | Role | Responsibilities |
|---|---|---|
| 1 | **Team Lead / Full-Stack** | Architecture decisions, integration, final submission, presentation |
| 2 | **Frontend Developer** | React UI, component library, responsive design, accessibility |
| 3 | **Backend Developer** | Spring Boot REST API, JPA entities, business logic, licensing module |
| 4 | **DevOps / Full-Stack** | CI/CD pipeline, Docker, deployment, environment management |
| 5 | **Business Analyst / UI-UX Designer** | Wireframes, user research, technical proposal document, presentation slides |
| 6 | **Researcher** | Regulatory landscape research, competitor analysis, citizen needs research, content writing, proposal evidence, presentation narrative |

> **Coders (1–5): commit code daily.** Commit format: `[ROLE] description`
> e.g. `[BE] Add ComplaintController CRUD` or `[FE] Add complaint submission form`
>
> **Researcher (6): no coding required.** Delivers research as Google Docs / PDF shared in the team channel. See [Researcher Deliverables](#researcher-deliverables) for the full task list.

---

## Researcher Deliverables

> This section is specifically for Member 6. No code required — all output is written documents or content delivered to the team via Google Docs or the team chat.

### Why This Role Matters
The BOCRA hackathon is judged as a **government tender**. Judges score the technical proposal on evidence of research, understanding of the regulatory environment, and real citizen needs. This is where the Researcher wins or loses the competition for the team.

---

### Phase 0 Deliverables (17–19 March)

| Deliverable | Description | Due |
|---|---|---|
| **BOCRA Deep Dive** | Read the BOCRA Act, browse bocra.org.bw, document: what services exist, what's broken, what citizens complain about. 1–2 pages of notes. | 17 Mar |
| **Competitor Benchmarking** | Review 3–5 similar regulatory authority websites (ICASA South Africa, CA Kenya, ZICTA Zambia). Screenshot and note what they do well that BOCRA doesn't. | 18 Mar |
| **Citizen Pain Points** | Ask 5–10 real people: "Have you ever tried to use the BOCRA website? What frustrated you?" Summarise findings in half a page. | 18 Mar |
| **Regulatory Context Summary** | Write a 1-page plain-English explanation of what BOCRA does, who its stakeholders are (citizens, licensees, ISPs, broadcasters), and why a modern website matters for each group. Feeds directly into the proposal Motivation section. | 19 Mar |

---

### Phase 1–2 Deliverables (20–23 March)

| Deliverable | Description | Due |
|---|---|---|
| **Website Page Content** | Write the actual text for: Homepage hero, About BOCRA, Consumer Protection, Cybersecurity Advisory, FAQ (min 10 Q&As). Deliver as a Google Doc. | 21 Mar |
| **User Personas** | Create 3 personas: e.g. "Grace — consumer with a billing complaint", "Thabo — ISP licensee renewing his licence", "Kabo — BOCRA staff managing complaints". Include: name, age, goal, frustration, what they need from the site. Used in the proposal and presentation. | 22 Mar |
| **Briefing Notes** | Attend the BOCRA briefing (23 March 0900hrs, MS Teams). Take detailed notes. Share a summary with the team immediately after. Any new requirements from BOCRA must be flagged to the Team Lead within 1 hour. | 23 Mar |

---

### Phase 3–4 Deliverables (24–27 March)

| Deliverable | Description | Due |
|---|---|---|
| **Proposal — Motivation Section** | Write the full Motivation section (1–1.5 pages): why BOCRA needs this platform, backed by Phase 0 research. Cite real examples from the benchmarking and citizen pain points. | 24 Mar |
| **Proposal — Research Evidence** | Compile competitor benchmarking, citizen pain points, and personas into a clean evidence appendix for the proposal. | 25 Mar |
| **Presentation Script** | Write the spoken script for the 31 March judging presentation. Each team member gets a section. Aim for 8–10 minutes total. | 26 Mar |
| **Walkthrough Video Script & Narration** | Write and narrate the walkthrough video. Tell a story: "Grace has a complaint → visits the new BOCRA site → submits online → gets a reference number → tracks her case." You narrate while the dev shares their screen. | 26 Mar |
| **Final Proofreading** | Proofread the entire technical proposal before submission. Check grammar, consistency, and that every BOCRA requirement from the brief is addressed. | 27 Mar |

---

## Tech Stack

### Frontend
- **Framework:** React 18 (Vite)
- **Styling:** Tailwind CSS + shadcn/ui
- **State Management:** Zustand
- **Routing:** React Router v6
- **Charts/Analytics:** Recharts
- **HTTP Client:** Axios
- **Accessibility:** ARIA roles, keyboard navigation, WCAG 2.1 AA

### Backend
- **Framework:** Spring Boot 3.x (Java 17+)
- **Security:** Spring Security + JWT (jjwt library)
- **ORM:** Spring Data JPA + Hibernate
- **Database:** PostgreSQL 15
- **Caching:** Redis (Spring Cache)
- **API Docs:** SpringDoc OpenAPI 3 (Swagger UI at `/swagger-ui.html`)
- **Validation:** Jakarta Bean Validation (`@Valid`, `@NotBlank`, etc.)
- **Build Tool:** Maven

### DevOps & Infrastructure
- **Version Control:** GitHub (this repo)
- **CI/CD:** GitHub Actions
- **Containerisation:** Docker + Docker Compose
- **Hosting:** Render / Railway (free tier for demo)

### Security
- Spring Security filter chain
- JWT Bearer token authentication
- BCrypt password hashing
- HTTPS enforced in production
- CORS policy configured per environment
- Rate limiting via Bucket4j

---

## Development Plan (17–27 March)

> **Registration: 18 March (0800–1700hrs). Hacking window: 20–27 March. Deadline: 27 March 2026 at 17:00hrs CAT.**

### Phase 0 — Pre-Hackathon Prep (17–19 March)

| Day | Task | Owner | Status |
|---|---|---|---|
| Mon 17 Mar | Repo setup, agree on API contracts (request/response DTOs) | Lead | ⬜ |
| Mon 17 Mar | Wireframes for all 8 key pages | UX | ⬜ |
| Mon 17 Mar | JPA entity design + DB schema (ERD) | Backend | ⬜ |
| Mon 17 Mar | React component library setup (Tailwind + shadcn) | Frontend | ⬜ |
| Mon 17 Mar | Docker Compose local environment (Postgres + Redis) | DevOps | ⬜ |
| Tue 18 Mar | Register on BDIH Skillsranker platform | Lead | ⬜ |
| Tue 18 Mar | Finalise wireframes → share with team | UX | ⬜ |
| Tue 18 Mar | Spring Boot project scaffold via Spring Initializr | Backend | ⬜ |
| Tue 18 Mar | React frontend scaffold (Vite + Tailwind) | Frontend | ⬜ |
| Wed 19 Mar | Microsoft Teams setup for Briefing (23 March 0900hrs) | All | ⬜ |
| Wed 19 Mar | Draft technical proposal outline | UX + Lead | ⬜ |
| Mon 17 Mar | BOCRA website deep dive + notes | Researcher | ⬜ |
| Tue 18 Mar | Competitor benchmarking (ICASA, CA Kenya, ZICTA) | Researcher | ⬜ |
| Tue 18 Mar | Citizen pain points interviews (5–10 people) | Researcher | ⬜ |
| Wed 19 Mar | Regulatory context summary (1 page, feeds proposal) | Researcher | ⬜ |

---

### Phase 1 — Foundation Sprint (20–21 March)

**Goal: Core infrastructure, authentication, homepage & navigation live.**

| Task | Owner | Day |
|---|---|---|
| Set up GitHub Actions CI (Maven build + React build) | DevOps | 20 Mar |
| Deploy skeleton app to staging (Docker on Render/Railway) | DevOps | 20 Mar |
| Implement: JPA entities (User, Complaint, License, Publication, Domain) | Backend | 20 Mar |
| Implement: JWT auth endpoints (`/api/auth/register`, `/api/auth/login`) | Backend | 20 Mar |
| Implement: Spring Security config + JWT filter chain | Backend | 20 Mar |
| Build: Header, Footer, Navigation component | Frontend | 20 Mar |
| Build: Homepage (hero, services overview, quick links) | Frontend | 20 Mar |
| Design: High-fidelity mockups | UX | 20 Mar |
| Write: Motivation section of technical proposal | UX | 20 Mar |
| Deliver: Website page content (homepage, about, FAQ text) | Researcher | 21 Mar |
| Create: 3 user personas document | Researcher | 22 Mar |
| Attend BOCRA Briefing + share notes within 1hr | Researcher + All | 23 Mar |
| Connect React auth flow to Spring Boot JWT API | Frontend + Backend | 21 Mar |
| Build: About BOCRA & Regulatory Framework pages | Frontend | 21 Mar |
| Implement: Licensing module REST endpoints + service layer | Backend | 21 Mar |
| Configure Redis caching for public endpoints | DevOps + Backend | 21 Mar |

---

### Phase 2 — Core Features Sprint (22–23 March)

**Goal: Citizen portal, complaints system, publications module.**

| Task | Owner | Day |
|---|---|---|
| Attend BOCRA Briefing (23 March 0900hrs, MS Teams) | All | 23 Mar |
| Build: Citizen complaint submission form | Frontend | 22 Mar |
| Build: Complaint tracking page (status lookup by reference no.) | Frontend | 22 Mar |
| Implement: `ComplaintController` — CRUD + status workflow | Backend | 22 Mar |
| Build: Publications & Regulatory Documents page | Frontend | 22 Mar |
| Implement: `PublicationController` — search & filter | Backend | 22 Mar |
| Build: Domain Registry lookup page | Frontend | 23 Mar |
| Implement: `DomainController` — domain lookup API | Backend | 23 Mar |
| Build: Consumer protection page + FAQ accordion | Frontend | 23 Mar |
| Accessibility audit (axe DevTools / WAVE) | UX + Frontend | 23 Mar |

---

### Phase 3 — Admin Dashboard & Analytics (24–25 March)

**Goal: Admin portal, analytics dashboard, cybersecurity advisory section.**

| Task | Owner | Day |
|---|---|---|
| Build: Admin dashboard layout + sidebar navigation | Frontend | 24 Mar |
| Build: Analytics charts (complaints by category, licensing stats) | Frontend | 24 Mar |
| Implement: `AdminController` — stats aggregation endpoints | Backend | 24 Mar |
| Implement: Role-based access (`ROLE_CITIZEN`, `ROLE_STAFF`, `ROLE_ADMIN`) | Backend | 24 Mar |
| Build: Cybersecurity advisory section | Frontend | 24 Mar |
| Implement: Email notification service (JavaMailSender / mock) | Backend | 25 Mar |
| Build: Stakeholder engagement / public consultation page | Frontend | 25 Mar |
| Security hardening (CORS, Bucket4j rate limiting, HTTPS) | DevOps + Backend | 25 Mar |
| Write: Solution design & architecture section of proposal | Lead + UX | 25 Mar |
| Deliver: Proposal Motivation + Research Evidence sections | Researcher | 25 Mar |

---

### Phase 4 — Polish, Performance & Proposal (26–27 March)

**Goal: Bug fixes, performance optimisation, final proposal, walkthrough video.**

| Task | Owner | Day |
|---|---|---|
| Full responsive testing (mobile, tablet, desktop) | Frontend | 26 Mar |
| Spring Boot performance (HikariCP connection pool, Redis cache tuning) | Backend + DevOps | 26 Mar |
| End-to-end testing of all user flows | All | 26 Mar |
| Final bug fixes | All | 26 Mar |
| Record walkthrough video (mandatory, min 3 min) | Lead + Researcher | 26 Mar |
| Finalise technical proposal (≤ 10 pages, exported as PDF) | UX + Lead + Researcher | 26 Mar |
| Package submission (ReadMe, source code, live URL, video) | Lead | 27 Mar |
| Upload to BDIH Skillsranker platform | Lead | 27 Mar |
| Email link to hackathon@bih.co.bw | Lead | 27 Mar |
| **⛳ DEADLINE: 27 March 17:00hrs CAT** | **All** | **27 Mar** |

---

## Architecture Overview

```
┌─────────────────────────────────────────────────────────────────┐
│                        CITIZEN / ADMIN                          │
│                     (Browser / Mobile)                          │
└──────────────────────────┬──────────────────────────────────────┘
                           │ HTTPS
┌──────────────────────────▼──────────────────────────────────────┐
│                    REACT FRONTEND (Vite)                        │
│    Homepage | Citizen Portal | Admin Dashboard | Publications   │
└──────────────────────────┬──────────────────────────────────────┘
                           │ REST API (JSON) — /api/**
┌──────────────────────────▼──────────────────────────────────────┐
│           SPRING BOOT 3 BACKEND (Java 17)                       │
│                                                                 │
│  ┌─────────────────────────────────────────────────────┐        │
│  │         Spring Security + JWT Filter Chain          │        │
│  └──────────────┬──────────────────────────────────────┘        │
│                 │                                               │
│  ┌──────────────▼──────────────────────────────────────┐        │
│  │  Controllers → Services → Repositories (Spring JPA) │        │
│  │  Auth | Licensing | Complaints | Publications |      │        │
│  │  Domain Registry | Admin Analytics                  │        │
│  └──────────────┬───────────────────────┬──────────────┘        │
└─────────────────┼───────────────────────┼────────────────────────┘
                  │                       │
     ┌────────────▼──────────┐  ┌─────────▼───────────────┐
     │    PostgreSQL 15      │  │      Redis Cache         │
     │  (Hibernate / JPA)    │  │  (Spring Cache)          │
     └───────────────────────┘  └─────────────────────────┘
```

---

## Repository Structure

```
ironclad-systems/
├── README.md
├── docker-compose.yml
├── .github/
│   ├── workflows/
│   │   └── ci.yml
│   └── pull_request_template.md
│
├── frontend/                            ← React + Vite app
│   ├── src/
│   │   ├── components/                  ← Reusable UI components
│   │   ├── pages/                       ← Route-level pages
│   │   ├── hooks/                       ← Custom React hooks
│   │   ├── store/                       ← Zustand state management
│   │   ├── services/                    ← Axios API functions
│   │   └── utils/
│   ├── public/
│   ├── .env.example
│   ├── index.html
│   ├── vite.config.js
│   └── package.json
│
├── backend/                             ← Spring Boot app
│   ├── src/main/java/bw/bocra/ironclad/
│   │   ├── auth/                        ← JWT utils, Security config, AuthController
│   │   ├── user/                        ← User entity, UserRepository, UserService
│   │   ├── complaint/                   ← Complaint entity, controller, service
│   │   ├── license/                     ← Licensing module
│   │   ├── publication/                 ← Publications module
│   │   ├── domain/                      ← Domain registry module
│   │   ├── admin/                       ← Admin stats & analytics endpoints
│   │   └── config/                      ← CORS, Redis, OpenAPI beans
│   ├── src/main/resources/
│   │   ├── application.yml
│   │   └── application-prod.yml
│   ├── Dockerfile
│   └── pom.xml
│
└── proposal/
    └── bocra-technical-proposal.pdf
```

---

## Getting Started

### Prerequisites

- Java 17+ — `java -version`
- Maven 3.8+ — `mvn -version`
- Node.js 18+ — `node -version`
- Docker & Docker Compose

### 1. Start Database + Redis

```bash
docker-compose up -d
```

### 2. Run the Spring Boot Backend

```bash
cd backend
# Edit src/main/resources/application.yml if needed (defaults match docker-compose)
mvn spring-boot:run
```

- API base URL: `http://localhost:8080/api`
- Swagger UI: `http://localhost:8080/swagger-ui.html`

### 3. Run the React Frontend

```bash
cd frontend
npm install
cp .env.example .env        # VITE_API_BASE_URL=http://localhost:8080/api
npm run dev
```

- App URL: `http://localhost:5173`

---

## application.yml Reference

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/bocra_db
    username: bocra_user
    password: bocra_password
  jpa:
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
  data:
    redis:
      host: localhost
      port: 6379

server:
  port: 8080

app:
  jwt:
    secret: CHANGE_THIS_IN_PRODUCTION_USE_256BIT_KEY
    expiration-ms: 604800000   # 7 days

springdoc:
  swagger-ui:
    path: /swagger-ui.html
```

---

## Git Workflow & Branching Strategy

```
main          ← Submission branch (protected — no direct pushes)
└── develop   ← Integration branch
    ├── feature/fe-homepage
    ├── feature/be-auth-jwt
    ├── feature/fe-complaints-form
    ├── feature/be-complaint-api
    └── ...
```

### Rules
1. **Never push directly to `main`** — PRs via `develop` only
2. Branch naming: `feature/[fe|be|devops|ux]-description`
3. Commit format: `[ROLE] description`
4. All PRs require **1 approval** before merging to `develop`
5. `develop` → `main` only at end of each phase

---

## Daily Standup Protocol

Every day at **08:30 CAT** (WhatsApp / Teams, max 10 minutes):

1. What did I complete yesterday?
2. What will I complete today?
3. Any blockers?

Lead logs blockers as a GitHub Issue and tags the relevant person.

---

## Submission Checklist

- [ ] Live URL accessible and stable
- [ ] Walkthrough video recorded (screen + voice, min 3 minutes)
- [ ] Source code on GitHub (clean history, this ReadMe present)
- [ ] Technical proposal PDF complete (≤ 10 pages)
- [ ] All files on Google Drive / OneDrive
- [ ] Submitted on BDIH Skillsranker platform
- [ ] Follow-up email sent to hackathon@bih.co.bw
- [ ] Total file size under 150MB

### Technical Proposal Must Cover
- [ ] Motivation — why our solution matters for BOCRA & citizens
- [ ] Solution design & architecture diagram
- [ ] Software stack with justification
- [ ] Lessons learned during development
- [ ] Evidence of research process

---

## Key Requirements Tracker

| BOCRA Requirement | Feature | Status |
|---|---|---|
| Improved UX & navigation | Redesigned info architecture + search | ⬜ |
| Accessibility (WCAG 2.1 AA) | ARIA roles, keyboard nav, colour contrast | ⬜ |
| System integration | Licensing, complaints, domain registry APIs | ⬜ |
| Self-service capabilities | Citizen complaint & licensing portal | ⬜ |
| Data-driven decision making | Admin analytics dashboard | ⬜ |
| Real-time analytics | Live stats charts (Recharts) | ⬜ |
| Cybersecurity advisory | Dedicated section + hardened Spring API | ⬜ |
| Modern security standards | Spring Security + JWT + BCrypt | ⬜ |
| Mobile responsiveness | Tailwind responsive, mobile tested | ⬜ |
| Public consultation tools | Stakeholder engagement page | ⬜ |

---

## Important Links

| Resource | Detail |
|---|---|
| Submission Platform | [BDIH Skillsranker](https://skillsranker.bih.co.bw/) |
| Submission Email | hackathon@bih.co.bw |
| Briefing | 23 March 2026 at 09:00hrs (Microsoft Teams) |
| Invitation Deadline | 20 March 2026 |
| Hack Deadline | **27 March 2026 at 17:00hrs CAT** |
| Prize (Winner) | P450,000 contract + P150,000/yr maintenance + 20Mbps LTE |

---

> **Ironclad Systems** — *Built for Botswana. Built to last.*
