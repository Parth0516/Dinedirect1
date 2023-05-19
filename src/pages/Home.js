import React from "react";
import { Link } from "react-router-dom";
import BannerImage from "../assets/food.jpg";
import "../styles/Home.css";

function Home() {
  return (
    <div className="home" style={{ backgroundImage: `url(${BannerImage})` }}>
      <div className="headerContainer">
        <h1 style={{ fontWeight: "bold" }}> Discover the <br/> world <br/> of flavors </h1>
        <p>Order Your Favorite Meals with Just a Few Clicks</p>  
        <p>Deliciousness Delivered Right to Your Doorstep!</p>
        <Link to="/menu">
          <button> ORDER NOW </button>
        </Link>
      </div>
    </div>
  );
}

export default Home;
