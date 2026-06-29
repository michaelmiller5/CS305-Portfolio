# CS305-Portfolio
# CS 305 Project Two: Practices for Secure Software Report

## Client Summary

Artemis Financial is a financial services company that handles sensitive client data and financial transactions. The company wanted to modernize and secure its web application by addressing vulnerabilities in how data was transmitted and stored. Specifically, they needed a secure communication channel to protect data in transit and a reliable way to verify data integrity. My role was to assess the existing application, implement a cryptographic hashing function using SHA-256, enable HTTPS through SSL/TLS certificate generation and configuration, and confirm the application remained functional and secure after those changes.

## What I Did Well

I think I did well in systematically identifying what the application was missing from a security standpoint and implementing targeted solutions rather than making broad, unfocused changes. Coding securely is important because vulnerabilities in software, especially in financial applications, can lead to data breaches, financial loss, and loss of customer trust. Software security adds value to a company's overall well-being by protecting its reputation, ensuring regulatory compliance, and reducing the risk of costly incidents down the line. A secure application is also more reliable and trustworthy, which directly supports business continuity.

## Challenging or Helpful Parts of the Vulnerability Assessment

The dependency check was one of the most helpful parts of the assessment. Running a dependency-check report surfaced known vulnerabilities in the libraries the application was using, which gave a clear, prioritized view of what needed to be addressed. It was also one of the more challenging parts because interpreting the results; understanding which vulnerabilities were actually exploitable in this context versus which were false positives or low risk, required careful judgment. Learning to read and act on those reports is a skill I'll carry into future security work.

## How I Increased Layers of Security

I increased security in several ways: implementing SHA-256 hashing to ensure sensitive data is never stored or transmitted in plain text, generating a self-signed certificate and configuring the application to use HTTPS for encrypted communication, and updating dependencies to reduce exposure to known vulnerabilities. In the future, I would continue using dependency-check tools (like OWASP Dependency-Check) alongside code review and static analysis tools to assess vulnerabilities. When deciding on mitigation techniques, I would weigh the severity of each vulnerability, its exploitability in the specific application context, and the effort required to remediate it.

## Ensuring Functionality and Security

After refactoring the code, I verified functionality by running the application and confirming it executed without errors, produced correct SHA-256 hash values, and communicated securely over HTTPS. To check whether refactoring introduced new vulnerabilities, I re-ran the dependency-check report after making changes and compared the results to the baseline. This secondary testing step is important because even well-intentioned changes can accidentally introduce new issues, and catching them early keeps the application secure.

## Helpful Resources, Tools, and Coding Practices

The OWASP Dependency-Check tool was invaluable for identifying vulnerable libraries. Java's built-in `MessageDigest` class made implementing SHA-256 straightforward and reliable. Spring Boot's support for SSL configuration simplified the HTTPS setup significantly. In terms of coding practices, keeping security concerns separated into dedicated controllers, following the principle of least privilege, and testing after every change were all habits that proved useful and will carry forward into future projects.

## What I Would Show Future Employers

This project is a strong portfolio piece because it demonstrates practical, hands-on experience with real-world security concepts — cryptographic hashing, SSL/TLS configuration, secure communication, and vulnerability assessment. These are skills employers in software development and cybersecurity actively look for. I would highlight the Practices for Secure Software Report as evidence of my ability to assess a system's security needs, implement industry-standard solutions, and document the process clearly. It shows I can think about software not just in terms of functionality, but in terms of security and reliability as well.
