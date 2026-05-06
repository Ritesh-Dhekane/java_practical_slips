# AI Context – Java Practical Slip Repository
## (Brain / Context Recovery File)

---

## 1. Project Status: ✅ FULLY VALIDATED (May 2026)

This repository has undergone a full systematic audit. All **131 Slips** are implemented and the infrastructure is 100% complete.

---

## 2. Key Maintenance Notes

### 🛠️ Important Fix Scripts
If you encounter syntax errors in Java files (specifically single quotes used for Strings), run the following from the root:
1. `python scratch/fix_quotes_v3.py` (For .java files)
2. `python scratch/fix_jsp_quotes.py` (For .jsp files)

### 🐛 Known Limitations
- **Servlet Compilation:** Java files importing `javax.servlet` will fail local `javac` unless the Servlet API is added to the classpath. This is expected and documented in `run.md`.
- **JDBC Connectivity:** Database code uses `college_db` with `root/root`. Ensure the MySQL service is running for testing.

---

## 3. UI & Frontend Architecture
- **Master Data:** `data/slips.json` is the single source of truth. Any new slips must be registered here.
- **Search Engine:** `index.html` implements a deep search across group names, slip IDs, and question titles.
- **Mobile Support:** CSS uses responsive design (clamp, flexbox, grid).

---

## 4. Syllabus Consistency Pass
- **Unit 1-5:** All implemented topics strictly follow the SPPU MCA Semester II curriculum.
- **No Overengineering:** Solutions are kept simple and exam-focused.

---

## 5. Deployment Instructions (GitHub Pages)
- The site is ready for static deployment.
- `index.html` MUST remain in the root directory.
- All asset paths are relative (`./web-viewer/...`).

---

## 6. How to Continue Work
If adding more content or modifying existing slips:
1. Follow the `slipX/qY/code/` hierarchy.
2. Every question requires: `explanation.md`, `run.md`, `output.txt`.
3. Every slip requires: `meta.md`.
4. Run `python scratch/validate_repo.py` to verify the new content doesn't break the JSON or folder structure.

---
*Last updated: May 2026 | Full Audit & Validation Complete*
