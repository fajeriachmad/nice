import { useState } from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="">
          {/* <Route path="/home" element={<Home />} /> */}
          <Route path="/food" element={<Food />} />
        </Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
