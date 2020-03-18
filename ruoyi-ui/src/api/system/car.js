import request from '@/utils/request'

// 查询车辆列表
export function listCar(query) {
  return request({
    url: '/system/car/list',
    method: 'get',
    params: query
  })
}

// 查询车辆详细
export function getCar(carId) {
  return request({
    url: '/system/car/' + carId,
    method: 'get'
  })
}

// 新增车辆
export function addCar(data) {
  return request({
    url: '/system/car',
    method: 'post',
    data: data
  })
}

// 修改岗位
export function updateCar(data) {
  return request({
    url: '/system/car',
    method: 'put',
    data: data
  })
}

// 删除岗位
export function delCar(carId) {
  return request({
    url: '/system/car/' + carId,
    method: 'delete'
  })
}

// 导出岗位
export function exportCar(query) {
  return request({
    url: '/system/car/export',
    method: 'get',
    params: query
  })
}