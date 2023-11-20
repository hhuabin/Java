import { getUserList, postUserList } from '@/api/index'

const Home = () => {

	const queryGetUserList = () => {
		getUserList()
		.then(res => {
			console.log(res.data);
		})
		.catch(error => {
			console.error(error);
		})
	}
	const queryPostUserList = () => {
		postUserList()
		.then(res => {
			console.log(res.data);
		})
		.catch(error => {
			console.error(error);
		})
	}

	return (
		<>
			<span onClick={queryGetUserList}><button>GetUserList</button></span>
			<span onClick={queryPostUserList}><button>PostUserList</button></span>
		</>
	)
}

export default Home
