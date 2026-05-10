# AI Context - Java Practical Slip Repository
## Context Recovery Notes

## 1. Current Validation State
- Do not assume the repository is fully validated
- Slips 11-20 were audited on 2026-05-10
- Use `SLIPS_11_20_AUDIT.md` before making fixes in that range

## 2. Verified Findings from Slips 11-20 Audit
- Confirmed compile failures:
  - `slips/slips-11-20/slip16/q2/code/Main.java`
  - `slips/slips-11-20/slip18/q1/code/DateTimeServlet.java`
- Confirmed JSP issue:
  - `slips/slips-11-20/slip20/q1/code/insertEmployees.jsp`
- Confirmed question/implementation mismatches:
  - `slips/slips-11-20/slip13/q1`
  - `slips/slips-11-20/slip15/q1`
- Confirmed viewer limitation:
  - `web-viewer/slip.html` only supports a hardcoded filename list and does not load some servlet/JSP files used by slips 18-20

## 3. Environment Notes
- JDK 17 is available locally
- `python` is not on PATH in this environment, but the bundled runtime exists at:
  - `C:\Users\ritesh\.cache\codex-runtimes\codex-primary-runtime\dependencies\python\python.exe`
- No servlet API jar found in repo
- No MySQL Connector/J jar found in repo

## 4. Deployment and Runtime Limits
- Servlet/JSP examples in slips 18-20 are not stored as full Tomcat webapp folders
- End-to-end servlet/JSP validation requires external Tomcat setup
- End-to-end JDBC validation requires MySQL plus Connector/J

## 5. Recommended Next Steps
1. Fix the verified blockers in slips 16, 18, and 20
2. Align slip 13 Q1 and slip 15 Q1 with their question wording
3. Repair `web-viewer/slip.html` source-file loading
4. Refresh summary/status docs after fixes are revalidated

## 6. Super Slips
- `super-slips/` contains reference implementations, not exam slips
- These projects are intended to be the gold-standard baseline for recurring concepts
- Current Super Slips:
  - `servlet-super-slip`
  - `jsp-super-slip`
  - `jdbc-super-slip`
  - `multithreading-super-slip`
  - `collections-super-slip`

## 7. How future work should use Super Slips
- When fixing servlet slips, refer to `super-slips/servlet-super-slip`
- When fixing JSP flow slips, refer to `super-slips/jsp-super-slip`
- When fixing JDBC slips, refer to `super-slips/jdbc-super-slip`
- When fixing thread slips, refer to `super-slips/multithreading-super-slip`
- When fixing collection slips, refer to `super-slips/collections-super-slip`
- Prefer reusing these structures and workflows instead of recreating infrastructure from scratch

*Last updated: 2026-05-10*
