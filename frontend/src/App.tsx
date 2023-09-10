import { useEffect, useState } from 'react'
import './App.css'
import Form from './Components/Form/Form'
import Table from './Components/Table/Table'

function App() {

  // Product Object
  const product = {
    id : 0,
    name : '',
    brand : '' 
  }

  // UseState
  const [btnRegister, setBtnRegister] = useState(true)
  const [products, setProducts] = useState([])
  const [objProduct, setObjProduct] = useState(product)
  
  // UseEffect
  useEffect(() => {
    fetch("http://localhost:8080/list")
    .then(response => response.json())
    .then(converted_response => setProducts(converted_response))
  }, [])

  // Get data from form
  const typing = (e) => {
    setObjProduct({...objProduct, [e.target.name] : e.target.value})
  }

  // Return
  return (
    <>
    <p>{JSON.stringify(objProduct)}</p>
      <Form btn={btnRegister} keyboardEvent={typing}/>
      <Table vector={products}/>
    </>
  )
}

export default App
