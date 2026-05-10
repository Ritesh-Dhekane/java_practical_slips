# Slips 11-20 Audit

Audit date: 2026-05-10

## Scope
- Reviewed only `slips/slips-11-20`
- Checked source files, `run.md`, `explanation.md`, `output.txt`, `meta.md`
- Cross-checked `data/slips.json`, `web-viewer/slip.html`, `index.html`, `PROJECT_SUMMARY.md`, and `AI_CONTEXT.md`

## Validation Method
- Verified folder and file presence for slips 11-20
- Validated `data/slips.json` paths for slips 11-20
- Compiled and ran standalone Java programs with local JDK 17 where possible
- Performed static validation for servlet/JSP assets

## Environment Limits
- JDK 17 is available locally
- No `servlet-api` jar is present in the repository
- No MySQL Connector/J jar is present in the repository
- Tomcat and MySQL runtime validation could not be completed end-to-end from this workspace alone

## Executive Summary
- `data/slips.json` paths for slips 11-20 are valid
- Most standalone Java examples compile and run
- Verified code defects exist in `slip16/q2`, `slip18/q1`, and `slip20/q1`
- Verified question-to-implementation mismatches exist in `slip13/q1` and `slip15/q1`
- Verified viewer/readability issues affect slips 18-20 because the web viewer cannot load some filename patterns
- Several status claims in repository-level docs currently overstate validation and deployment readiness

## Slip-by-Slip Analysis

### Slip 11
Implementation summary:
- `q1` uses `ArrayList<String>` and interactive search
- `q2` demonstrates runtime polymorphism with `Employee[]`

Validation:
- `q1` compiled and ran successfully
- `q2` compiled and ran successfully

Findings:
- No logic or structure defects verified
- Low: mojibake appears in some output strings where arrows/dashes are expected

Suggested fixes:
- Normalize text encoding in source and documentation strings

### Slip 12
Implementation summary:
- `q1` uses `TreeMap` correctly and displays sorted keys
- `q2` demonstrates final variable, final class, and final method

Validation:
- `q1` compiled and ran successfully
- `q2` compiled and ran successfully

Findings:
- No logic or structure defects verified
- Low: output strings contain mojibake instead of punctuation in some places

Suggested fixes:
- Normalize encoding for titles, comments, and printed messages

### Slip 13
Implementation summary:
- `q1` converts names in an `ArrayList` to uppercase
- `q2` compares abstract class and interface with working examples

Validation:
- `q1` compiled and ran successfully
- `q2` compiled and ran successfully

Findings:
- Medium: `q1` does not accept 5 names from the user as stated in the question title; names are hardcoded in [slips/slips-11-20/slip13/q1/code/Main.java](D:\Workspace\College\java_practical_slips\slips\slips-11-20\slip13\q1\code\Main.java) lines 13-18
- Low: explanation is usable but does not mention the mismatch between the title and the current hardcoded approach

Suggested fixes:
- Replace hardcoded names with interactive input for 5 names
- Update explanation/output after implementation is aligned

### Slip 14
Implementation summary:
- `q1` uses `LinkedList` and removes a user-specified city
- `q2` demonstrates constructor overloading in `Person`

Validation:
- `q1` compiled and ran successfully
- `q2` compiled and ran successfully
- `q1` removal flow works for valid input such as `Pune`

Findings:
- No verified logic or structure defects

Suggested fixes:
- Optional: mention exact-match behavior in `q1` so users know partial names will not match

### Slip 15
Implementation summary:
- `q1` reverses one array into another
- `q2` demonstrates single, multilevel, and hierarchical inheritance

Validation:
- `q1` compiled and ran successfully
- `q2` compiled and ran successfully

Findings:
- Medium: `q1` does not accept 5 integers from the user as stated in the question; it uses a fixed array in [slips/slips-11-20/slip15/q1/code/Main.java](D:\Workspace\College\java_practical_slips\slips\slips-11-20\slip15\q1\code\Main.java) lines 9-10
- Low: run guide implies a generic executable flow but not that the current implementation is non-interactive

Suggested fixes:
- Replace hardcoded array values with user input for 5 integers
- Refresh sample output to show prompt-driven execution

### Slip 16
Implementation summary:
- `q1` calculates total, percentage, and grade for `Student`
- `q2` demonstrates overloaded `add()` methods in `Calculator`

Validation:
- `q1` compiled and ran successfully
- `q2` failed compilation

Findings:
- High: `q2` does not compile because the string literal in [slips/slips-11-20/slip16/q2/code/Main.java](D:\Workspace\College\java_practical_slips\slips\slips-11-20\slip16\q2\code\Main.java) line 50 contains unescaped double quotes around `add`
- Medium: `meta.md` still marks the slip as complete despite a confirmed compile failure

Suggested fixes:
- Escape or rephrase the offending string literal in `q2`
- Re-run `javac` and update `output.txt` after correction
- Revisit slip status metadata after validation

### Slip 17
Implementation summary:
- `q1` stores employee names in `Vector` and searches by user input
- `q2` explains checked vs unchecked exceptions with working examples

Validation:
- `q1` compiled and ran successfully
- `q2` compiled and ran successfully
- `q1` works for full-name exact matches such as `Rahul Verma`

Findings:
- No verified logic defects
- Low: `q1` requires exact full-string matches; this is acceptable but not explained to the learner
- Low: mojibake appears in some printed punctuation in `q2`

Suggested fixes:
- Mention exact-match behavior in explanation or sample run
- Normalize encoding in displayed strings

### Slip 18
Implementation summary:
- `q1` is a servlet intended to display current date and time
- `q2` demonstrates overloaded `add()` methods

Validation:
- `q1` failed compilation during static validation
- `q2` compiled and ran successfully

Findings:
- High: `q1` contains invalid Java string literals in [slips/slips-11-20/slip18/q1/code/DateTimeServlet.java](D:\Workspace\College\java_practical_slips\slips\slips-11-20\slip18\q1\code\DateTimeServlet.java) lines 39, 41, 42, and 44 because HTML attribute quotes were not escaped
- Medium: `q1` run guide is not realistically followable as written because it refers to a `WebApp/WEB-INF/classes/` deployment layout that is not present in the repository and does not explain how to assemble the webapp from the current `q1/code` folder; see [slips/slips-11-20/slip18/q1/run.md](D:\Workspace\College\java_practical_slips\slips\slips-11-20\slip18\q1\run.md) lines 8-15
- Medium: the web viewer cannot load `DateTimeServlet.java` because `web-viewer/slip.html` only checks a hardcoded filename list that does not include this filename; see [web-viewer/slip.html](D:\Workspace\College\java_practical_slips\web-viewer\slip.html) line 48
- Low: sample output contains mojibake for the calendar emoji

Suggested fixes:
- Escape embedded HTML quotes in servlet output strings
- Provide a repository-aligned Tomcat folder layout or rewrite the guide to explain assembly from the current structure
- Expand viewer filename support beyond the current hardcoded list

### Slip 19
Implementation summary:
- `q1` uses `index.html` to post customer name and city to `display.jsp`
- `q2` demonstrates thread priorities

Validation:
- `q1` page flow is structurally coherent from `index.html` to `display.jsp`
- `q2` compiled and ran successfully

Findings:
- Medium: `q1` run guide claims a `WEB-INF/web.xml` file in the project structure, but no such file exists under the slip folder; see [slips/slips-11-20/slip19/q1/run.md](D:\Workspace\College\java_practical_slips\slips\slips-11-20\slip19\q1\run.md) lines 6-12
- Medium: the checked-in repository is not a ready-to-deploy Tomcat app folder; the guide assumes a `CustomerApp/` wrapper that is not present in the current slip directory
- Medium: the viewer cannot render either `display.jsp` or `index.html` for this slip because [web-viewer/slip.html](D:\Workspace\College\java_practical_slips\web-viewer\slip.html) line 48 only searches a limited hardcoded set of filenames
- Low: `q2` sample output should be treated as illustrative only because thread scheduling order is nondeterministic

Suggested fixes:
- Correct the project structure section in `run.md`
- Either add an actual deployable app layout or document the manual packaging steps clearly
- Update the viewer to support JSP/HTML filenames used by this slip

### Slip 20
Implementation summary:
- `q1` is a JSP + JDBC page that inserts employee records
- `q2` reverses an input sentence using `StringBuilder`

Validation:
- `q1` could not be executed end-to-end locally because Tomcat, MySQL, and Connector/J are not present in the repo, but static validation found translation/runtime issues
- `q2` compiled and ran successfully

Findings:
- High: `q1` contains invalid scriptlet Java in [slips/slips-11-20/slip20/q1/code/insertEmployees.jsp](D:\Workspace\College\java_practical_slips\slips\slips-11-20\slip20\q1\code\insertEmployees.jsp) lines 84 and 86 because the `class=\"err\"` quotes are not escaped inside Java string literals; this would break JSP translation
- Medium: `q1` inserts fixed primary keys on every request, so a second successful visit will hit duplicate-key SQL errors instead of cleanly re-running
- Medium: `q1` run guide assumes an `EmployeeApp/` deployment folder that does not exist in the repository and omits the exact packaging/workflow needed from the current `q1/code` folder; see [slips/slips-11-20/slip20/q1/run.md](D:\Workspace\College\java_practical_slips\slips\slips-11-20\slip20\q1\run.md) lines 13-16
- Medium: the viewer cannot display `insertEmployees.jsp` or `setup.sql` because [web-viewer/slip.html](D:\Workspace\College\java_practical_slips\web-viewer\slip.html) line 48 does not look for those files and only renders one source file anyway
- Low: `q2` sample output is incorrect for `MCA Semester II`; the actual reversed string is `II retsemeS ACM`, but [slips/slips-11-20/slip20/q2/output.txt](D:\Workspace\College\java_practical_slips\slips\slips-11-20\slip20\q2\output.txt) shows `II retseM ACM`

Suggested fixes:
- Escape the error-message strings in the JSP scriptlet
- Make inserts idempotent or explain one-time-run expectations clearly
- Rewrite the deployment guide around the actual repository layout
- Extend the viewer to support JSP, HTML, SQL, and multiple source files per question
- Correct the sample output for `q2`

## Structural Consistency Review
- All slips 11-20 exist and all `data/slips.json` paths for those slips resolve correctly
- No deployable Tomcat project skeletons are checked in for slips 18-20; the repository stores code snippets and docs rather than ready-to-drop webapps
- `meta.md` files still use `Complete` wording even where compile/runtime issues are confirmed

## Viewer and Mapping Review
- `data/slips.json` references for slips 11-20 are valid
- `web-viewer/slip.html` is a real blocker for some slips in this range because it only searches this fixed filename set:
  - `Main.java`
  - `index.jsp`
  - `MyServlet.java`
  - `StudentServlet.java`
  - `CalcServlet.java`
  - `AddServlet.java`
  - `MulServlet.java`
  - `WelcomeServlet.java`
  - `GreetServlet.java`
  - `LifeServlet.java`
  - `EmpServlet.java`
  - `SafeServlet.java`
- Because of that limitation:
  - Slip 18 Q1 source is unreachable in the viewer
  - Slip 19 Q1 source files are unreachable in the viewer
  - Slip 20 Q1 source and SQL setup are unreachable in the viewer

## Severity Summary
- High:
  - Slip 16 Q2 compile failure
  - Slip 18 Q1 compile failure
  - Slip 20 Q1 JSP translation failure
- Medium:
  - Slip 13 Q1 question mismatch
  - Slip 15 Q1 question mismatch
  - Slip 18 Q1 deployment guide mismatch
  - Slip 19 Q1 project-structure/doc mismatch
  - Slip 20 Q1 duplicate-insert behavior
  - Viewer source-loading gaps for slips 18-20
- Low:
  - Mojibake/readability issues across strings and docs
  - Slip 17 Q1 exact-match behavior not explained
  - Slip 20 Q2 sample output typo

## Recommended Next Steps
1. Fix verified build/runtime blockers first: slip16 q2, slip18 q1, slip20 q1
2. Align question wording and implementation for slip13 q1 and slip15 q1
3. Repair viewer source-file loading for slips 18-20
4. Rewrite servlet/JSP deployment guides so they match the repository structure
5. Normalize encoding and refresh affected sample outputs
