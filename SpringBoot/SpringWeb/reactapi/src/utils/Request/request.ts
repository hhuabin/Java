import axios, { AxiosInstance, AxiosRequestConfig, AxiosResponse, AxiosError } from 'axios'

import formatDate from './formatDate'

export default class Axios {
	private service: AxiosInstance = axios.create({
		baseURL: process.env.VUE_APP_BASE_URL,
		timeout: 60000,
	});
	private commonParams: {
		version: string;
		charset: string;
		req_source: string;
		system: string;
		requestSerial?: string;
		timestamp?: string | Date | number;
		token?: string;
	} = { version: '1.0', charset: 'UTF-8', req_source: 'SPRINGWEB', system: 'H5' };

	constructor() {
		this.init()
	}

	// 异常拦截处理器
	private errorHandler = (error: AxiosError) => {
		if(error?.response) {
			if(error.response.status === 403) {
				console.error('拒绝访问');
			} else if(error.response.status === 404) {
				console.error('不存在该资源');
			} else if(error.response.status === 500) {
				console.error('服务器端错误');
			} else if(error.response.status === 502) {
				console.error('网络错误');
			}
		}
		return Promise.reject(error)
	}

	private init = () => {
		this.service.interceptors.request.use((config) => {
			const { data } = config
			// 深拷贝数据，令对象不被改变
			const commonParam = {...this.commonParams}
			// requestSerial 请求序列号
			let requestSerial: string = new Date().getTime().toString()
			for (let i = 0; i < 6; i++) {
				requestSerial += Math.floor(Math.random() * 10)
			}
			commonParam.requestSerial = requestSerial
			// timestamp 请求时间
			const timestamp: string = formatDate(new Date(), 'YYYY-MM-DD hh:mm:ss')
			commonParam.timestamp = timestamp
		
			commonParam.token = ''
			config.data = { ...data, ...commonParam }
			return config
		}, this.errorHandler)
		
		this.service.interceptors.response.use((response: AxiosResponse) => {
			// response.status === 200
			if (response.data.result_code === '0') {
				return response
			} else {
				return Promise.reject(new Error(response.data.err_msg))
			}
		}, this.errorHandler)
	}

	public getAxiosInstance = () => {
		return this.service
	}
}