import React from "react";
import MultiplePizzas from "../assets/masala1.jpg";
import "../styles/About.css";
function About() {
  return (
    <div className="about">
      <div
        className="aboutTop"
        style={{ backgroundImage: `url(${MultiplePizzas})` }}
      ></div>
      <div className="aboutBottom">
        <h1> ABOUT</h1> <h2>US</h2>
        <p>
        Our food ordering website is a convenient and user-friendly platform that allows customers to order food from their favorite restaurants with just a
         few clicks. The website provides a vast array of options for customers to choose from, ranging from local cuisine to international delicacies. Customers can search for restaurants based on their location, cuisine, or specific dishes they are craving.
        </p>
      </div>
    </div>
  );
}

export default About;
