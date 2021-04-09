export default [
  {
    path: '/realTimeJobCenter',
    name: 'RealTimeJobCenter',
    meta: {
      title: 'Streamis',
      keepAlive: false, // 缓存导致页面有多个编辑器，广播事件会触发报错
      publicPage: true, // 权限公开
    },
    component: () =>
      import('./view/realTimeJobCenter/index.vue'),
  }
]
