<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>My Profile</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
    <main class="card profile">
        <div class="avatar">${name.substring(0,1)}</div>
        <h1>${name}</h1>
        <p class="subtitle">${programme}</p>

        <dl>
            <dt>Name</dt>
            <dd>${name}</dd>

            <dt>Student ID</dt>
            <dd>${studentId}</dd>

            <dt>Programme</dt>
            <dd>${programme}</dd>

            <dt>Email</dt>
            <dd>${email}</dd>

            <dt>Hobbies</dt>
            <dd>${hobbies}</dd>

            <dt>Short Self-Introduction</dt>
            <dd class="intro">${intro}</dd>
        </dl>

        <div class="actions">
            <a class="button" href="${pageContext.request.contextPath}/index.html">&larr; Edit Profile</a>
        </div>
    </main>
</body>
</html>
