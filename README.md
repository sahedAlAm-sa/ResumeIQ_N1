# ResumeIQ — Full Project

## Technology Stack
- Desktop Application: JavaFX
- Web Front-End: HTML, CSS, JavaScript, Bootstrap 5
- Web Back-End: Node.js + Express.js
- Database: MySQL schema included in `database/resumeiq.sql`
- Version Control & Design Tools: Git, GitHub, Figma

## Run Web Application
Open VS Code terminal:

```cmd
cd backend
npm install
npm start
```

Then open:

http://localhost:5000

Demo login:
- Email: user@resumeiq.com
- Password: user123

## Run JavaFX Desktop Application
Requirements: JDK 17+ and Maven.

Open terminal in `desktop-javafx`:

```cmd
cd desktop-javafx
mvn javafx:run
```

The JavaFX module is the ResumeIQ Admin Command Center.

## Bootstrap
Bootstrap 5.3.3 is included in the web pages via CDN for responsive components and UI utilities.

## MySQL
`database/resumeiq.sql` contains the MySQL schema for the project. The current easy-run web demo uses a local JSON data file so it can run without configuring MySQL. For the fully database-backed deployment, connect the Node.js backend to MySQL using the included schema.

## Git / GitHub / Figma
These are development and design tools rather than runtime dependencies. Initialize Git in the project root and push the project to GitHub; use Figma for the UI design/prototype.
