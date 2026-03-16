# 03 — Citizen Pain Points
**Prepared for Ironclad Systems | BOCRA Hackathon**
**Date: 16 March 2026**

---

## Overview

This document captures the real frustrations citizens, businesses and stakeholders experience when trying to interact with BOCRA and the current website. These pain points directly inform our solution design and are the human evidence behind our technical proposal.

---

## Pain Point 1 — "I Don't Know How to Complain"

**Who:** General citizens with billing disputes, poor service quality, or network coverage issues against operators like Mascom, BTC, or Orange.

**The Problem:**
When a citizen has a complaint against their mobile operator, they are supposed to first complain to the operator, and if unresolved, escalate to BOCRA. But most citizens do not know:
- That BOCRA accepts complaints from the public
- What information to include in a complaint
- Where to send the complaint
- What happens after they send it
- How long it will take

The current website does not make this journey clear. There is no guided complaint form, no FAQ on the process, and no acknowledgement that a complaint was received.

**What Our Solution Does:**
A guided, step-by-step complaint submission form with clear instructions, required fields, and an automatic reference number issued on submission. The citizen knows immediately their complaint exists in the system.

---

## Pain Point 2 — "I Sent a Complaint Months Ago and Heard Nothing"

**Who:** Citizens who have already submitted complaints via email or post.

**The Problem:**
After submitting a complaint, citizens enter a black hole. There is no:
- Acknowledgement email with a reference number
- Online portal to check status
- Estimated resolution timeframe
- Notification when the complaint status changes

The only way to follow up is to call the BOCRA offices or physically visit — both options that working citizens cannot easily do during office hours.

**What Our Solution Does:**
A complaint tracking page where any citizen can enter their reference number and see the current status — Submitted, Under Review, In Progress, Resolved, or Closed — with timestamps at each stage.

---

## Pain Point 3 — "The Website Doesn't Work on My Phone"

**Who:** All citizens — particularly the majority of Batswana who access the internet via mobile phone.

**The Problem:**
Botswana's internet penetration is predominantly mobile. The BOCRA website is not designed for mobile screens. Text is small, navigation is difficult, and forms are nearly impossible to complete on a phone. A citizen trying to look up their consumer rights or find BOCRA's contact details while on the move cannot do so effectively.

**What Our Solution Does:**
A fully responsive React frontend built with Tailwind CSS — designed mobile-first so that the experience on a phone is as good as on a desktop.

---

## Pain Point 4 — "I Can't Find the Document I'm Looking For"

**Who:** Licensees, lawyers, researchers, journalists, and businesses needing regulatory documents.

**The Problem:**
BOCRA publishes regulations, acts, consultation papers, annual reports and consumer guides. But these are scattered across the website with no unified search. A user who wants to find the regulations on quality of service for internet providers must already know where to look. There is no search bar that searches across all publications simultaneously.

**What Our Solution Does:**
A searchable publications library with category filters — search by keyword, filter by document type, sorted by date. One search finds everything.

---

## Pain Point 5 — "Renewing My Licence Takes Forever"

**Who:** Licensed operators — ISPs, broadcasters, radio operators, businesses with VANS licences.

**The Problem:**
Licence renewal is a physical, paper-based process. A licensee must prepare documents, travel to BOCRA's offices in Gaborone, submit in person, and wait. For licensees based outside Gaborone — in Francistown, Maun, Kasane — this is a significant time and cost burden.

**What Our Solution Does:**
An online licensing portal where licensees can view their current licences, initiate renewals, upload required documents, and track the status of their application — all without leaving their offices.

---

## Pain Point 6 — "I Don't Know My Consumer Rights"

**Who:** General public — particularly consumers of mobile, internet and broadcasting services.

**The Problem:**
Most Batswana do not know what service quality they are entitled to, what BOCRA's role is in protecting them, or what recourse they have when operators fail them. The current website has consumer protection information but it is buried and not written in plain, accessible language.

**What Our Solution Does:**
A dedicated Consumer Protection section with plain-language explanations of consumer rights, operator obligations, and a clear path to submit a complaint — written by our researcher in accessible Setswana-friendly English.

---

## Pain Point 7 — "I Need to Check if a .BW Domain is Available"

**Who:** Businesses and entrepreneurs wanting to register a .BW domain name.

**The Problem:**
There is no easily accessible domain lookup tool on the BOCRA website. Someone who wants to register a .BW domain for their business has no simple way to check availability or find out the registration process without contacting BOCRA directly.

**What Our Solution Does:**
A domain registry lookup tool — enter a domain name, instantly see if it is available, registered, or expired, along with the registrar details.

---

## Summary — Pain Points Mapped to Features

| Pain Point | Affected Stakeholder | Our Feature |
|---|---|---|
| Don't know how to complain | Citizens | Guided complaint submission form |
| No complaint tracking | Citizens | Complaint tracking by reference number |
| Website broken on mobile | All users | Fully responsive mobile-first design |
| Can't find documents | Licensees, researchers | Searchable publications library |
| Licence renewal is manual | Licensed operators | Online licensing portal |
| Don't know consumer rights | General public | Consumer protection section |
| No domain lookup tool | Businesses | Domain registry lookup |

---

## The Human Case for Our Solution

Every one of these pain points has a real person behind it:
- A grandmother in Maun who was overcharged by her mobile operator and doesn't know she can complain to BOCRA
- A small business owner in Francistown who drove 400km to Gaborone to renew a licence that should be renewable online
- A journalist trying to find a regulatory document for 30 minutes before giving up

Our solution does not just tick technical boxes — it removes real barriers between Batswana citizens and the regulatory protection they are entitled to.

---

*Sources: BOCRA website, BOCRA Hackathon Brief, Communications Regulatory Authority Act 2012, team research and citizen interviews*