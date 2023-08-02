import { useEffect, useState } from "react";
import axios from "axios";

export default function Food() {
  const [foods, setFoods] = useState([]);
  const getFoods = async () => {
    await axios
      .get("http://localhost:8080/food")
      .then((response) => {
        setFoods(response.data);
      })
      .catch((err) => {
        console.log(err.message);
      });
  };
  useEffect(() => {
    getFoods();
  }, []);
  return (
    <div>
      <h1>Food Table</h1>
      <table id="food-table">
        <thead>
          <tr>
            <th>Food ID</th>
            <th>Name</th>
          </tr>
        </thead>
        <tbody>
          {foods.map((food) => (
            <tr key={food.id}>
              <td>{food.id}</td>
              <td>{food.name}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}
