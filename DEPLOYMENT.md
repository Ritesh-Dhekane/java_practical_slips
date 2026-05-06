# Deployment Guide

This project features a fully functional frontend interface (Web Viewer) built with static HTML, CSS, and JS. It requires no backend server to view the solutions, making it a perfect candidate for GitHub Pages deployment.

## 1. How to Deploy on GitHub Pages
* **Push the Repository**: Ensure all your local changes (including `index.html` at the root) are committed and pushed to your GitHub repository.
* **Go to Settings**: On your GitHub repository page, click on the **Settings** tab.
* **Navigate to Pages**: On the left sidebar, scroll down and click on **Pages**.
* **Select Branch**: Under the "Build and deployment" section, choose **Deploy from a branch**. Select your main branch (e.g., `main` or `master`).
* **Root Folder**: Select `/ (root)` as the folder.
* **Save**: Click **Save**. GitHub will take a minute or two to build and deploy your site.

## 2. Access URL
Once deployed, GitHub will display a message saying "Your site is live at" followed by a URL. It typically looks like:
`https://<your-username>.github.io/<repository-name>/`

## 3. Notes
* **Ensure `index.html` is in Root**: For GitHub pages to properly auto-load the site, the main `index.html` file must exist in the root folder.
* **No Server Required**: Because the frontend reads data via relative fetches to static `data/slips.json`, it acts as a Static Site Generator. No Node.js, Tomcat, or Python server is required to host the documentation interface!
