import './TableStyles.css'

export default function Table() {
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
        <tr>
          <td>1</td>
          <td>asdas</td>
          <td>dasda</td>
          <td></td>
        </tr>
        <tr>
          <td>2</td>
          <td>fasf</td>
          <td>fasfas</td>
          <td></td>
        </tr>
      </tbody>
    </table>
  )
}