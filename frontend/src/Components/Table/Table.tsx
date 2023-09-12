import './TableStyles.css'

export default function Table({vector, select}) {
  return (
    <table className="content-table">
      <thead>
        <tr>
          <th>#</th>
          <th>Name</th>
          <th>Brand</th>
          <th>Select</th>
        </tr>
      </thead>
      <tbody>
        {
          vector.map((obj, index) => (
            <tr key={index}>
              <td>{index+1}</td>
              <td>{obj.name}</td>
              <td>{obj.brand}</td>
              <td className='tdBtn'><button className='btn' onClick={() => {select(index)}} >Select</button></td>
            </tr>
          ))
        }
      </tbody>
    </table>
  )
}
