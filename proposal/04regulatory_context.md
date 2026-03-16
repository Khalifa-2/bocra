# 04 — Regulatory Context Summary
**Prepared for Ironclad Systems | BOCRA Hackathon**
**Date: 16 March 2026**

---

## What This Document Is

A plain-English explanation of BOCRA's regulatory environment, its stakeholders, and why a modern digital platform is not a luxury — it is a legal and operational necessity. Written for use in the technical proposal.

---

## BOCRA's Legal Mandate

BOCRA was established by the **Communications Regulatory Authority Act, 2012 (CRA Act)**. The Act mandates BOCRA to:

1. Regulate the communications sector in the public interest
2. Protect the rights of consumers of communications services
3. Promote competition and investment in the sector
4. Manage the radio frequency spectrum as a national resource
5. Administer the .BW domain name registry
6. Advise the government on communications policy

Everything BOCRA does flows from this mandate. The website is the primary public interface through which BOCRA fulfils this mandate digitally. A broken website is therefore not just a UX problem — it is a failure to execute on a legal obligation.

---

## The Regulatory Ecosystem

BOCRA sits at the centre of a complex ecosystem of stakeholders:

### Regulated Entities (Licensees)
These are the companies and organisations that hold BOCRA licences:
- **Mobile Network Operators:** Mascom Wireless, BTC (Botswana Telecommunications Corporation), Orange Botswana
- **Internet Service Providers:** Multiple licensed ISPs operating across Botswana
- **Broadcasters:** Btv (Botswana Television), RB1/RB2 (Radio Botswana), Gabz FM, Yarona FM, and community radio stations
- **Postal Operators:** Botswana Post and licensed courier services
- **VANS Operators:** Value Added Network Services providers
- **Satellite Operators:** International satellite service providers with Botswana footprint

### Citizens and Consumers
Approximately **2.6 million** Batswana who use communications services regulated by BOCRA. They have legal rights under the CRA Act that BOCRA is mandated to enforce on their behalf.

### Government
- **Ministry of Transport and Communications:** The parent ministry that oversees BOCRA
- **Parliament:** BOCRA is accountable to Parliament through annual reports
- **Other Ministries:** Interact with BOCRA on spectrum, cybersecurity and digital economy policy

### International Bodies
- **ITU (International Telecommunication Union):** BOCRA coordinates with ITU on spectrum and numbering
- **CRASA (Communications Regulators Association of Southern Africa):** Regional body of which BOCRA is a member
- **ISOC (Internet Society):** BOCRA collaborates on internet governance and .BW ccTLD management

---

## Why a Modern Platform Is a Regulatory Necessity

### 1. The CRA Act Requires Public Accessibility
The Act mandates BOCRA to make information publicly available and to provide accessible channels for citizens to exercise their rights. A website that cannot be used on a mobile phone, that requires citizens to fax complaints, and that has no searchable document library is not fulfilling this obligation.

### 2. Botswana's Digital Economy Strategy
The Government of Botswana's **Digital Transformation Strategy** and **National Broadband Strategy** both identify digital public services as a national priority. BOCRA — as the regulator of the digital infrastructure sector — cannot credibly regulate digital transformation while operating with a pre-digital website.

### 3. Regional Competitiveness
BOCRA's peers in the region — ICASA in South Africa, CA Kenya, ZICTA in Zambia — are all investing in digital service delivery. Botswana's regulatory environment needs to match regional standards to attract investment in its communications sector.

### 4. Citizen Trust and Regulatory Legitimacy
A regulator derives its legitimacy from public trust. When citizens cannot access BOCRA's services, cannot submit complaints, and cannot see what BOCRA is doing — trust erodes. A transparent, accessible digital platform is essential to BOCRA's credibility as an independent regulator.

### 5. Operational Efficiency
BOCRA processes complaints, licence applications, domain registrations and consultations manually. This creates processing delays, staff inefficiency, and a growing backlog. Digital automation of these processes directly improves BOCRA's operational capacity without increasing headcount.

---

## The Timing of This Hackathon

The BOCRA Website Development Hackathon is taking place at a specific moment in Botswana's digital history:

- Botswana has over **1.8 million internet users** (roughly 70% penetration) with the majority accessing via mobile
- The government has committed to expanding broadband coverage to all 490 villages under the **National Broadband Strategy**
- BOCRA's regulatory workload is growing as the digital economy expands — more complaints, more licence applications, more domain registrations
- The existing website was built for a different era and cannot scale to meet these demands

The organisation that wins this hackathon will not just be building a website. They will be building the digital infrastructure through which millions of Batswana interact with their communications regulator for the next decade. The stakes are exactly that high.

---

## Summary for the Proposal

| Context Factor | Implication for Our Solution |
|---|---|
| Legal mandate to protect consumers | Complaint portal is legally required, not optional |
| 2.6 million citizens as stakeholders | Mobile-first design is non-negotiable |
| Growing digital economy | Scalable architecture built on Spring Boot + PostgreSQL |
| Government digital transformation agenda | Our solution aligns with national policy priorities |
| Regional benchmarking | We deliver features that exceed regional peers |
| Manual processes creating backlogs | Automation reduces BOCRA's operational burden |

---

*Sources: Communications Regulatory Authority Act 2012, BOCRA website, Botswana National Broadband Strategy, ITU, CRASA, BOCRA Hackathon Brief March 2026*