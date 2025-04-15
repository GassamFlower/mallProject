/*
 * @创建人: 倪博涵
 * @Date: 2025-04-02 21:47:07
 * @文件介绍: 
 * @留言/注意事项: 无
 */
'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')

module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',
  BASE_API: '"http://wxdev.ngrok.ixueye.vip"'
})
