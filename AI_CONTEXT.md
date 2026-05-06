# AI Context – Java Practical Slip Repository
## (Brain / Context Recovery File for future AI sessions)

---

## 1. What This Project Is

A complete, exam-oriented Java practical solution archive for:

> **Savitribai Phule Pune University (SPPU)**
> **MCA Semester II – Java Programming (PBJ555MJP)**
> **KES's Pratibha Institute of Business Management, MCA Dept**
> **Term End Practical Examination – May 2026**

Total slips in PDF: **130 slips** × 2 questions = 260 programs

---

## 2. Repository Structure

```
java-practical-slips/
│
├── index.html                  ← ROOT level web viewer entry point
│
├── docs/
│   └── slips.pdf               ← Source PDF with all 130 slip questions
│
├── slips/
│   ├── slips-1-10/
│   │   ├── slip1/
│   │   │   ├── q1/
│   │   │   │   ├── code/       ← Java/JSP/Servlet/HTML source files
│   │   │   │   ├── output.txt  ← Sample output
│   │   │   │   ├── explanation.md
│   │   │   │   └── run.md
│   │   │   ├── q2/
│   │   │   └── meta.md         ← Slip-level metadata
│   │   ├── slip2/ ... slip10/
│   ├── slips-11-20/            ← Pending
│   ├── slips-21-30/            ← Pending
│   └── ... up to slips-121-130/
│
├── common/
│
├── web-viewer/
│   ├── folder.html
│   ├── slip.html
│   ├── css/
│   ├── js/
│   └── assets/
│
├── data/
│   └── slips.json              ← Master data file consumed by web viewer
│
├── README.md
├── PROJECT_SUMMARY.md
├── DEPLOYMENT.md
└── AI_CONTEXT.md               ← THIS FILE
```

---

## 3. Slip Organization Rules

- Each group folder = 10 slips (e.g., `slips-1-10`, `slips-11-20`)
- Each slip folder = `slip1` ... `slip10` (NOT `slip01`)
- Each question = `q1` or `q2`
- Code lives in `q1/code/` or `q2/code/`

### File Naming per Question
| File | Purpose |
|---|---|
| `code/Main.java` | Core Java programs |
| `code/XyzServlet.java` | Servlet programs |
| `code/page.jsp` | JSP programs |
| `code/index.html` | HTML form (for Servlet/JSP questions) |
| `code/setup.sql` | DB setup scripts (for JDBC questions) |
| `output.txt` | Sample output |
| `explanation.md` | Concept explanation |
| `run.md` | How to compile and run |
| `meta.md` | Slip-level metadata (at slip root) |

---

## 4. How the Web Viewer Works

- `index.html` (ROOT) — lists all slip groups, links to `web-viewer/folder.html`
- `web-viewer/folder.html` — lists slips within a group
- `web-viewer/slip.html` — shows Q1 and Q2 details for a single slip
- `data/slips.json` — master data file; web viewer reads this to build the UI
- All paths in `slips.json` are **relative to the repository root**

---

## 5. JSON Structure (`data/slips.json`)

```json
{
  "groups": [
    {
      "name": "Slips 1 to 10",
      "folder": "slips-1-10",
      "slips": [
        {
          "id": 1,
          "questions": [
            { "title": "Question title", "path": "slips/slips-1-10/slip1/q1" },
            { "title": "Question title", "path": "slips/slips-1-10/slip1/q2" }
          ]
        }
      ]
    }
  ]
}
```

**Rules:**
- `path` is always relative to repo root (no leading `/`)
- `title` should match the actual question summary from PDF
- `id` = slip number (integer, 1–130)

---

## 6. Syllabus Constraints (STRICT)

ONLY implement topics from:

| Unit | Topics |
|------|--------|
| UNIT 1 | Class & Objects, Inheritance, Polymorphism, Abstraction, Encapsulation, Abstract Class, Interface, Garbage Collection, Lambda Expressions |
| UNIT 2 | Collections (ArrayList, Vector, Set, Map), Hashing, Multithreading, Synchronization, Inter-thread communication, Exception Handling, User-defined Exception |
| UNIT 3 | Servlets |
| UNIT 4 | JSP, JDBC |
| UNIT 5 | Spring MVC |

❌ Do NOT add Spring Boot, Maven, Hibernate, or frameworks not in syllabus.

---

## 7. Current Progress

| Slips | Status |
|-------|--------|
| 1–10  | ✅ Complete |
| 11–20 | ⏳ Pending |
| 21–30 | ⏳ Pending |
| 31–40 | ⏳ Pending |
| 41–50 | ⏳ Pending |
| 51–60 | ⏳ Pending |
| 61–70 | ⏳ Pending |
| 71–80 | ⏳ Pending |
| 81–90 | ⏳ Pending |
| 91–100 | ⏳ Pending |
| 101–110 | ⏳ Pending |
| 111–120 | ⏳ Pending |
| 121–130 | ⏳ Pending |

---

## 8. Completed Slips Summary (1–10)

| Slip | Q1 Topic | Q2 Topic |
|------|----------|----------|
| 1 | ArrayList – Sort integers | Lambda Expression – x^y |
| 2 | HashMap – entrySet() display | Method Overriding – Person/Student |
| 3 | HashSet – Duplicate rejection | Abstract Class Person → Employee |
| 4 | ArrayList – Second highest salary | Interface Shape – Circle/Rectangle |
| 5 | Multithreading – Runnable, 1–10 | Servlet Life Cycle |
| 6 | Exception Handling – NumberFormatException | JSP Implicit Objects |
| 7 | Servlet – Welcome Employee | Thread – Custom name |
| 8 | JSP – Multiply 2 numbers (expression tag) | Runtime Polymorphism – Employee/Manager |
| 9 | JSP + JDBC – Retrieve Student records | Interface vs Abstract Class |
| 10 | Encapsulation – Employee getters/setters | Servlet Life Cycle (detailed) |

---

## 9. Implementation Rules for Future Slips

1. **Always use `public class Main`** for Core Java programs
2. **Servlets**: name the class descriptively (e.g., `WelcomeServlet.java`), include `index.html` form
3. **JSP**: name file descriptively (e.g., `multiply.jsp`), include `index.html` form + `setup.sql` if JDBC
4. **Never use pseudocode** – all code must compile and run
5. **Every `q1/` and `q2/` folder** must have: `code/`, `output.txt`, `explanation.md`, `run.md`
6. **Every slip folder** must have: `meta.md`
7. **Update `data/slips.json`** with real question titles when adding new slips
8. **Keep explanations short** – exam-focused, not tutorial-length
9. **Syllabus-only** – no Spring Boot, no Maven, no Hibernate
10. **GitHub Pages compatible** – no server-side build step in root

---

## 10. Deployment

- **GitHub Pages**: `index.html` at root → automatically served
- **No build step** required for the web viewer
- **Servlet/JSP**: needs Tomcat locally – not auto-deployable on GitHub Pages
  - Provide `run.md` with Tomcat deployment steps
  - Provide `setup.sql` for JDBC questions

---

## 11. Important Notes

- The PDF `docs/slips.pdf` was extracted to `slips.txt` (project root) using PDFBox
- `slips.txt` contains all 130 slip questions – use it as reference for future sessions
- `ProjectGenerator.java` (root) was the original scaffold generator – do NOT delete
- `pdfbox.jar` (root) was used for PDF extraction – can be deleted after extraction
- `slips.txt` (root) can be deleted after all slips are implemented

---

## 12. How to Add Future Slips (e.g., Slips 11–20)

1. Read questions from `slips.txt` (lines for Slip 11 onwards)
2. For each slip:
   - Create `slips/slips-11-20/slip11/q1/code/`, `q2/code/`
   - Write `Main.java` (or appropriate files)
   - Write `output.txt`, `explanation.md`, `run.md`
   - Write `meta.md` at slip root
3. Update `data/slips.json` – add slip entries to the `"Slips 11 to 20"` group
4. Verify paths in JSON match actual folder structure
5. Do NOT touch `index.html`, `web-viewer/`, or any other existing slip folders

---

*Last updated: May 2026 | Slips 1–10 implemented*
