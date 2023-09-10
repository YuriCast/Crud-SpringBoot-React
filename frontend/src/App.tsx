import { useEffect, useState } from 'react'
import './App.css'
import Form from './Components/Form/Form'
import Table from './Components/Table/Table'

function App() {

  // UseState
  const [btnRegister, setBtnRegister] = useState(true);
  const [products, setProducts] = useState([])
  
  // UseEffect
  useEffect(() => {
    fetch("http://localhost:8080/list")
    .then(response => response.json())
    .then(converted_response => setProducts(converted_response));
  }, []);

  // Return
  return (
    <>
    <p>{JSON.stringify(products)}</p>
      <Form btn={btnRegister}/>
      <Table />
    </>
  )
}

export default App
