import http.server
import socketserver

# Define the directory containing the .class files
CLASS_FILES_DIR = "D:/backend-development/JAVA/Learn-Java-Basics/Java-Basics/target/test"
PORT = 8000

# Create a handler to serve files from the CLASS_FILES_DIR
handler = http.server.SimpleHTTPRequestHandler
handler.directory = CLASS_FILES_DIR

# Start the server
with socketserver.TCPServer(("", PORT), handler) as httpd:
    print(f"Serving .class files at http://localhost:{PORT}")
    print(f"Serving directory: {CLASS_FILES_DIR}")
    httpd.serve_forever()  