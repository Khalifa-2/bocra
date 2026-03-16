# 02 — Competitor Benchmarking
**Prepared for Ironclad Systems | BOCRA Hackathon**
**Date: 16 March 2026**

---

## Purpose
Analyse 3 peer regulatory authority websites — ICASA (South Africa), CA Kenya, and ZICTA (Zambia) — to identify digital features that BOCRA currently lacks and that our solution will deliver.

---

## 1. ICASA — Independent Communications Authority of South Africa
**Website:** icasa.org.za

### What They Do Well
- **Online Complaints Portal** — Citizens can submit complaints directly on the website under "Consumer Protection → Online Complaints." No need to visit offices or send a fax.
- **Online Licensing Portal** — A dedicated portal at `online.icasa.org.za` handles Spectrum Licence and Type Approval applications entirely online.
- **Numbering Portal** — A separate self-service portal for numbering applications.
- **Structured Document Library** — Legislation, regulations, annual reports, council minutes, compliance reports and quality of service reports are all searchable and categorised.
- **Public Consultation System** — Citizens and stakeholders can participate in regulatory inquiries online and submit written comments.
- **Compliance CRM** — An internal CRM system visible to the public for compliance tracking.
- **Accessibility Statement** — ICASA explicitly states that persons with disabilities can request documents in accessible formats.

### What They Do Poorly
- The website navigation is cluttered and overwhelming for first-time users.
- No unified citizen dashboard — services are spread across multiple sub-portals.
- Mobile experience is poor.

### What We Take From ICASA
✅ Online complaint submission — we build this
✅ Online licensing portal — we build this
✅ Searchable document library — we build this
✅ Public consultation page — we build this

---

## 2. CA Kenya — Communications Authority of Kenya
**Website:** ca.go.ke | **eCitizen Portal:** ca.ecitizen.go.ke

### What They Do Well
- **eCitizen Integration** — Kenya's CA is fully integrated into the national eCitizen platform. Citizens apply for services and pay using mobile money (M-Pesa). This is best-in-class for Africa.
- **Online Complaint Filing** — Dedicated complaint filing page with a structured process. Citizens know exactly what to submit and what to expect.
- **Clear Escalation Process** — The website clearly explains: complain to your provider first → if unresolved, escalate to CA → acknowledged within 3 days → resolved within 10 days. Citizens know where they stand.
- **IMEI Verification Tool** — Citizens can check if their phone is genuine directly on the website.
- **Child Online Protection Portal** — Dedicated section for reporting child online abuse.
- **Incident Reporting App** — A cybersecurity incident reporting tool integrated into the website.
- **Regional Offices Listed** — Nairobi, Mombasa, Kisumu, Nyeri and Eldoret offices all listed with contacts.
- **Broadcasting Complaints** — Separate dedicated complaints channel for broadcasting content issues.

### What They Do Poorly
- Heavy reliance on the eCitizen platform means the CA website itself is thin on functionality.
- No real-time complaint tracking visible to the citizen.

### What We Take From CA Kenya
✅ Clear complaint escalation process with timeframes — we include this in our UI
✅ Structured complaint categories — we build this into our form
✅ Cybersecurity incident reporting — we include this
✅ Mobile-friendly design — we build this with Tailwind responsive

---

## 3. ZICTA — Zambia Information and Communications Technology Authority
**Website:** zicta.zm

### What They Do Well
- **Online Reporting Portal** — ZICTA has an online portal specifically for reporting child sexual abuse content, built in partnership with the Internet Watch Foundation.
- **Child Online Protection Strategy** — A comprehensive national strategy (2025–2029) is published and accessible on their platform.
- **Active Social Media Presence** — ZICTA uses Facebook and LinkedIn heavily to communicate with citizens, including scam alerts, safety tips and service announcements.
- **Consumer Education Content** — Regular public awareness content on mobile money scams, cybersafety, and consumer rights.
- **Short Code Service (*707#)** — Citizens can report mobile money scams via USSD — shows thinking beyond the website.
- **Public Consultation Portal** — A unified notice-and-comment consultation portal for regulatory input.

### What They Do Poorly
- The main website is thin on self-service features.
- Call centre has experienced outages — citizens directed to social media as fallback, which is not professional.
- No complaint tracking system.
- No online licensing portal.

### What We Take From ZICTA
✅ Consumer education content — our researcher writes this for BOCRA
✅ Cybersecurity awareness section — we include this
✅ Public consultation portal concept — we include stakeholder engagement page

---

## Summary Comparison Table

| Feature | ICASA (SA) | CA Kenya | ZICTA (Zambia) | BOCRA (Current) | Our Solution |
|---|---|---|---|---|---|
| Online complaint submission | ✅ | ✅ | ❌ | ❌ | ✅ |
| Complaint tracking | ❌ | ❌ | ❌ | ❌ | ✅ |
| Online licensing portal | ✅ | ✅ | ❌ | ❌ | ✅ |
| Searchable document library | ✅ | ✅ | ✅ | ❌ | ✅ |
| Admin analytics dashboard | ❌ | ❌ | ❌ | ❌ | ✅ |
| Mobile responsive design | ❌ | ✅ | ❌ | ❌ | ✅ |
| Cybersecurity section | ✅ | ✅ | ✅ | ❌ | ✅ |
| Public consultation tools | ✅ | ✅ | ✅ | ❌ | ✅ |
| Domain registry lookup | N/A | N/A | N/A | ❌ | ✅ |
| Real-time analytics | ❌ | ❌ | ❌ | ❌ | ✅ |

---

## Key Finding for the Proposal

BOCRA's current platform lags behind every peer regulator in the region on basic digital service delivery. Even ZICTA — a smaller, less resourced regulator — has online reporting portals and active digital citizen engagement tools that BOCRA does not.

More importantly: **not one of these three regulators has a complaint tracking system.** This is our differentiator. A citizen who submits a complaint and can track its status in real time is a feature that does not exist anywhere in the region. Ironclad Systems delivers this for BOCRA first.

---

*Sources: icasa.org.za, ca.go.ke, ca.ecitizen.go.ke, zicta.zm, Wikipedia, Capital FM Kenya, TechAfrica News*