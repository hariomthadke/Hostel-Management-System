package com.nt.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userpage")
public class UserPage extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  PrintWriter pw=res.getWriter();
	  res.setContentType("text/html");
	  pw.println("<!DOCTYPE html>\r\n"
	  		+ "<html lang=\"en\" >\r\n"
	  		+ "<head>\r\n"
	  		+ "  <meta charset=\"UTF-8\">\r\n"
	  		+ "  <link rel=\"icon\" href=\"hostel.jpeg\" style=\"background-color: white;\">\r\n"
	  		+ "  <title>SGGS Hostel Portal</title>\r\n"
	  		+ "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\r\n"
	  		+ "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" >\r\n"
	  		+ "  <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n"
	  		+ "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n"
	  		+ "<link href=\"https://fonts.googleapis.com/css2?family=Lobster&family=Roboto+Slab:wght@400;500&display=swap\" rel=\"stylesheet\">\r\n"
	  		+ "  <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n"
	  		+ "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n"
	  		+ "<link href=\"https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@400;500&display=swap\" rel=\"stylesheet\">\r\n"
	  		+ "  <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n"
	  		+ "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n"
	  		+ "<link href=\"https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@500&display=swap\" rel=\"stylesheet\"\r\n"
	  		+ "integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n"
	  		+ "<link rel=\"stylesheet\" href=\"studentpage.css\">\r\n"
	  		+ "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js\"></script>\r\n"
	  		+ "\r\n"
	  		+ "\r\n"
	  		+ "\r\n"
	  		+ "</head>\r\n"
	  		+ "<body>\r\n"
	  		+ "<!-- partial:index.partial.html -->\r\n"
	  		+ "<div class=\"top\">\r\n"
	  		+ "\r\n"
	  		+ "  <div class=\"header\">\r\n"
	  		+ "    <img src=\"collage_logo.png\" alt=\"logo\" />\r\n"
	  		+ "    <h1>SHRI GURU GOBIND SINGHJI <br> INSTITUTE OF ENGINEERING AND TECHNOLOGY, <br> VISHNUPURI, NANDED : 431606  <br><span class=\"font_header\">(An Autonomous Institute Owned by Government of Maharashtra)</span>\r\n"
	  		+ "     <br>\r\n"
	  		+ "    <br ></h1>\r\n"
	  		+ "  </div>\r\n"
	  		+ "</div>\r\n"
	  		+ "<div class=\"mains\">\r\n"
	  		+ "  \r\n"
	  		+ "    <div class=\"left\">\r\n"
	  		+ "        <h3>Student Pannel</h3>\r\n"
	  		+ "        <div class=\"line\">\r\n"
	  		+ "            <i class=\"fa-solid fa-window-restore\"></i>\r\n"
	  		+ "            <a class=\"side_h\" style=\"display: inline;\" href=\"stuprofile.html\">Profile</a>\r\n"
	  		+ "          </div>\r\n"
	  		+ "          <div class=\"line\">\r\n"
	  		+ "            <i class=\"fa-solid fa-code-pull-request\"></i>\r\n"
	  		+ "            <a class=\"side_h\" style=\"display: inline; \" href=\"userRegistration.html\">Apply for Hostel </a>\r\n"
	  		+ "          </div>\r\n"
	  		+ "       \r\n"
	  		+ "          <div class=\"line\">\r\n"
	  		+ "            <i class=\"fa-solid fa-address-card\"></i>\r\n"
	  		+ "            <a class=\"side_h\" style=\"display: inline;\" href=\"userLeaveApplication.html\">Write Leave Application</a>\r\n"
	  		+ "          </div>\r\n"
	  		+ "          \r\n"
	  		+ "          <div class=\"line\">\r\n"
	  		+ "            <i class=\"fa-solid fa-gear\"></i>\r\n"
	  		+ "            <a class=\"side_h\" style=\"display: inline;\" href=\"userComplaint.html\">Add Complaint</a>\r\n"
	  		+ "          </div>\r\n"
	  		+ "        \r\n"
	  		+ "          <div class=\"line\">\r\n"
	  		+ "            <i class=\"fa-solid fa-gear\"></i>\r\n"
	  		+ "            <a class=\"side_h\" style=\"display: inline;\" href=\"/HostelManagementSystem/feedback\"> Feedback/Sugggetion</a>\r\n"
	  		+ "          </div>\r\n"
	  		+ "          <div class=\"line\">\r\n"
	  		+ "            <i class=\"fa-solid fa-right-from-bracket\"></i>\r\n"
	  		+ "            <a class=\"side_h\" style=\"display: inline;\" href=\"/HostelManagementSystem/index.html\">Log Out</a>\r\n"
	  		+ "          </div>\r\n"
	  		+ "       \r\n"
	  		+ "        \r\n"
	  		+ "       \r\n"
	  		+ "    </div>\r\n"
	  		+ "    <div class=\"other\">\r\n"
	  		+ "        \r\n"
	  		+ "      <div id=\"content\">\r\n"
	  		+ "        \r\n"
	  		+ "       \r\n"
	  		+ "\r\n"
	  		+ "        \r\n"
	  		+ "\r\n"
	  		+ "       \r\n"
	  		+ "\r\n"
	  		+ "        <div id=\"directors-message\">\r\n"
	  		+ "            <h2>Director's Message</h2>\r\n"
	  		+ "            <p>&emsp; \r\n"
	  		+ "              At our SGGSIE&T, we strive to provide an exceptional experience that nurtures your intellectual growth, hones your technical skills, and fosters your personal development. Our accomplished many faculty members, who earned Ph.D. from IITs. All faculty members are renowned experts in their respective fields, and they are committed to imparting their knowledge and expertise to guide you toward excellence. <br><br>\r\n"
	  		+ "              &emsp; \r\n"
	  		+ "              We offer state-of-the-art facilities, a Center of Excellence, Industry supported laboratories, a Robotic Center, an IDEA Laboratory, cutting-edge laboratories, and a comprehensive curriculum designed by following NEP 2020 guidelines to equip you with the theoretical foundation and practical skills necessary to thrive in the engineering industry. Furthermore, our institute encourages interdisciplinary collaboration, as we believe that innovation often arises from the intersection of different fields and perspectives.\r\n"
	  		+ "              <br><br>\r\n"
	  		+ "              &emsp;\r\n"
	  		+ "              But engineering is not solely about technical proficiency. It is about embracing creativity, critical thinking, and a global mindset. It is about learning from failure, persisting through challenges, and developing resilience. We encourage you to seize every opportunity to engage in extracurricular activities like PRAGYYA (a national level technical event), UTSAV (Annual cultural event), and ZENITH (State level Sports event), participate in research projects, and involve yourself in the numerous student organizations and 40 different clubs on campus. These experiences will enhance your leadership abilities, expand your horizons, and foster lifelong friendships. For your overall personality development institute has a state-of-art air-conditioned gymnasium, Yoga Centre, Turf wicket Cricket ground, volleyball ground, football ground, tennis court, etc, these facilities will help you keep physically fit.\r\n"
	  		+ "              <br><br>\r\n"
	  		+ "              &emsp;\r\n"
	  		+ "              Remember that success is not solely measured by grades or accomplishments, but by the impact you make in the world. As engineering students, you have the potential to contribute to society in profound ways, whether it be through designing sustainable infrastructure, developing groundbreaking technology, or improving the quality of life for individuals and communities. Your skills and knowledge are powerful tools, and we encourage you to use them responsibly and ethically.\r\n"
	  		+ "              <br><br>\r\n"
	  		+ "              &emsp;\r\n"
	  		+ "              As you embark on this exciting chapter of your life, know that our doors are always open to support and guide you. Our Laboratories are open 24X7. Our dedicated team of advisors, mentors, and staff is here to provide you with the resources and assistance you need to thrive academically, personally, and professionally.\r\n"
	  		+ "              <br><br>\r\n"
	  		+ "              &emsp;\r\n"
	  		+ "              I am thrilled to have you as a part of our SGGSIE&T family, and I cannot wait to witness your growth and accomplishments over the coming years. Embrace every opportunity, challenge yourself, and be bold in pursuing your dreams.\r\n"
	  		+ "              <br><br>\r\n"
	  		+ "              &emsp;\r\n"
	  		+ "              Once again, welcome to Shri Guru Gobind Singhji Institute of Engineering and Technology, Vishnupuri, Nanded. Together, let us embark on this incredible journey of discovery, innovation, and transformation.\r\n"
	  		+ "              <br><br>\r\n"
	  		+ "              &emsp;\r\n"
	  		+ "              Best wishes,\r\n"
	  		+ "              <br>\r\n"
	  		+ "              &emsp;\r\n"
	  		+ "              Manesh B Kokare, Ph.D. (IIT Kharagpur)\r\n"
	  		+ "              <br>\r\n"
	  		+ "              &emsp;\r\n"
	  		+ "              (BOYSCAST Post Doctoral Fellow, University of California SB, USA)\r\n"
	  		+ "              <br>\r\n"
	  		+ "              &emsp;\r\n"
	  		+ "              Director</p>\r\n"
	  		+ "            <img id=\"director-image\" src=\"director.png\" alt=\"Director's Image\">\r\n"
	  		+ "        </div>\r\n"
	  		+ "        <div id=\"notifications\">\r\n"
	  		+ "          <h2><i class=\"fa-sharp fa-solid fa-bell fa-shake fa-xl\"></i> Notifications & News</h2>\r\n"
	  		+ "          <div class=\"notificationbox\">\r\n"
	  		+ "            <ul>\r\n"
	  		+ "              <li><a href=\"#\">Notification2</a></li>\r\n"
	  		+ "              <li><a href=\"#\">Notification3</a></li>\r\n"
	  		+ "              <li><a href=\"#\">Notification4</a></li>\r\n"
	  		+ "              <li><a href=\"#\">Notification5</a></li>\r\n"
	  		+ "              <li><a href=\"#\">Notification5</a></li>\r\n"
	  		+ "              <li><a href=\"#\">Notification6</a></li>\r\n"
	  		+ "               <li><a href=\"#\">Notification2</a></li>\r\n"
	  		+ "              <li><a href=\"#\">Notification3</a></li>\r\n"
	  		+ "              <li><a href=\"#\">Notification4</a></li>\r\n"
	  		+ "              <li><a href=\"#\">Notification5</a></li>\r\n"
	  		+ "              <li><a href=\"#\">Notification5</a></li>\r\n"
	  		+ "              <li><a href=\"#\">Notification6</a></li>\r\n"
	  		+ "            </ul>\r\n"
	  		+ "           \r\n"
	  		+ "          </div>\r\n"
	  		+ "      </div>\r\n"
	  		+ "    </div>\r\n"
	  		+ "    <div class=\"container\">\r\n"
	  		+ "\r\n"
	  		+ "      <!-- Full-width images with number text -->\r\n"
	  		+ "      <div class=\"mySlides\">\r\n"
	  		+ "        <div class=\"numbertext\">1 / 6</div>\r\n"
	  		+ "          <img id=\"pic\" src=\"img1.jpg\" style=\"width:100%\">\r\n"
	  		+ "      </div>\r\n"
	  		+ "    \r\n"
	  		+ "      <div class=\"mySlides\">\r\n"
	  		+ "        <div class=\"numbertext\">2 / 6</div>\r\n"
	  		+ "          <img id=\"pic\" src=\"img2.jpg\" style=\"width:100%\">\r\n"
	  		+ "      </div>\r\n"
	  		+ "    \r\n"
	  		+ "      <div class=\"mySlides\">\r\n"
	  		+ "        <div class=\"numbertext\">3 / 6</div>\r\n"
	  		+ "          <img id=\"pic\" src=\"img3.jpg\" style=\"width:100%\">\r\n"
	  		+ "      </div>\r\n"
	  		+ "    \r\n"
	  		+ "      <div class=\"mySlides\">\r\n"
	  		+ "        <div class=\"numbertext\">4 / 6</div>\r\n"
	  		+ "          <img id=\"pic\" src=\"img4.JPG\" style=\"width:100%\">\r\n"
	  		+ "      </div>\r\n"
	  		+ "    \r\n"
	  		+ "      <div class=\"mySlides\">\r\n"
	  		+ "        <div class=\"numbertext\">5 / 6</div>\r\n"
	  		+ "          <img id=\"pic\" src=\"img5.JPG\" style=\"width:100%\">\r\n"
	  		+ "      </div>\r\n"
	  		+ "    \r\n"
	  		+ "      <div class=\"mySlides\">\r\n"
	  		+ "        <div class=\"numbertext\">6 / 6</div>\r\n"
	  		+ "          <img id=\"pic\" src=\"img6.jpg\" style=\"width:100%\">\r\n"
	  		+ "      </div>\r\n"
	  		+ "    \r\n"
	  		+ "      <!-- Next and previous buttons -->\r\n"
	  		+ "      <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\r\n"
	  		+ "      <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\r\n"
	  		+ "    \r\n"
	  		+ "      <!-- Image text -->\r\n"
	  		+ "      <div class=\"caption-container\">\r\n"
	  		+ "        <p id=\"caption\"></p>\r\n"
	  		+ "      </div>\r\n"
	  		+ "    \r\n"
	  		+ "      <!-- Thumbnail images -->\r\n"
	  		+ "      <div class=\"row\">\r\n"
	  		+ "        <div class=\"column\">\r\n"
	  		+ "          <img class=\"demo cursor\" src=\"img1.jpg\" style=\"width:100%\" onclick=\"currentSlide(1)\" alt=\"Utsav : Cultural Event\">\r\n"
	  		+ "        </div>\r\n"
	  		+ "        <div class=\"column\">\r\n"
	  		+ "          <img class=\"demo cursor\" src=\"img2.jpg\" style=\"width:100%\" onclick=\"currentSlide(2)\" alt=\"Zenith : Sports Event\">\r\n"
	  		+ "        </div>\r\n"
	  		+ "        <div class=\"column\">\r\n"
	  		+ "          <img class=\"demo cursor\" src=\"img3.jpg\" style=\"width:100%\" onclick=\"currentSlide(3)\" alt=\"Secure Environment\">\r\n"
	  		+ "        </div>\r\n"
	  		+ "        <div class=\"column\">\r\n"
	  		+ "          <img class=\"demo cursor\" src=\"img4.JPG\" style=\"width:100%\" onclick=\"currentSlide(4)\" alt=\"Shruti Marathe : Chief Guest\">\r\n"
	  		+ "        </div>\r\n"
	  		+ "        <div class=\"column\">\r\n"
	  		+ "          <img class=\"demo cursor\" src=\"img5.JPG\" style=\"width:100%\" onclick=\"currentSlide(5)\" alt=\"Nature and sunrise\">\r\n"
	  		+ "        </div>\r\n"
	  		+ "        <div class=\"column\">\r\n"
	  		+ "          <img class=\"demo cursor\" src=\"img6.jpg\" style=\"width:100%\" onclick=\"currentSlide(6)\" alt=\"Snowy Mountains\">\r\n"
	  		+ "        </div>\r\n"
	  		+ "      </div>\r\n"
	  		+ "    </div>\r\n"
	  		+ "\r\n"
	  		+ "\r\n"
	  		+ "    </div>\r\n"
	  		+ "     \r\n"
	  		+ "    \r\n"
	  		+ "\r\n"
	  		+ "  </div>\r\n"
	  		+ "</div>  \r\n"
	  		+ "</body>\r\n"
	  		+ "<script>let slideIndex = 1;\r\n"
	  		+ "  showSlides(slideIndex);\r\n"
	  		+ "  \r\n"
	  		+ "  // Next/previous controls\r\n"
	  		+ "  function plusSlides(n) {\r\n"
	  		+ "    showSlides(slideIndex += n);\r\n"
	  		+ "  }\r\n"
	  		+ "  \r\n"
	  		+ "  // Thumbnail image controls\r\n"
	  		+ "  function currentSlide(n) {\r\n"
	  		+ "    showSlides(slideIndex = n);\r\n"
	  		+ "  }\r\n"
	  		+ "  \r\n"
	  		+ "  function showSlides(n) {\r\n"
	  		+ "    let i;\r\n"
	  		+ "    let slides = document.getElementsByClassName(\"mySlides\");\r\n"
	  		+ "    let dots = document.getElementsByClassName(\"demo\");\r\n"
	  		+ "    let captionText = document.getElementById(\"caption\");\r\n"
	  		+ "    if (n > slides.length) {slideIndex = 1}\r\n"
	  		+ "    if (n < 1) {slideIndex = slides.length}\r\n"
	  		+ "    for (i = 0; i < slides.length; i++) {\r\n"
	  		+ "      slides[i].style.display = \"none\";\r\n"
	  		+ "    }\r\n"
	  		+ "    for (i = 0; i < dots.length; i++) {\r\n"
	  		+ "      dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n"
	  		+ "    }\r\n"
	  		+ "    slides[slideIndex-1].style.display = \"block\";\r\n"
	  		+ "    dots[slideIndex-1].className += \" active\";\r\n"
	  		+ "    captionText.innerHTML = dots[slideIndex-1].alt;\r\n"
	  		+ "  }</script>\r\n"
	  		+ "\r\n"
	  		+ "</html>\r\n"
	  		+ "    ");
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
