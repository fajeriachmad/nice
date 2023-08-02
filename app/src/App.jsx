import { useState } from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";
import Food from "./pages/food/food";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="">
          <Route path="/" element={<Home />} />
          <Route path="/food" element={<Food />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
