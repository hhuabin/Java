import axios from 'axios'
import Axios from '@/utils/Request/request'
import { AxiosPromise } from 'axios'
import {
	IpublicAnswer,
} from './indexType'

const service = new Axios().getAxiosInstance()

const BASEURL = "/api1"

export const getUserList = (): AxiosPromise<IpublicAnswer> => {
	return axios.get(BASEURL + "/getlist", {
		params: {
			
		}
	})
}
export const postUserList = (): AxiosPromise<IpublicAnswer> => {
	return service({
		url: BASEURL + '/user/postlist',
		data: {
			hello: "hello",
		},
		method: 'post',
	})
}
