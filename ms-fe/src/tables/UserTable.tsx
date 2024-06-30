import React, {useEffect, useState} from 'react';
import {Table} from "antd";

export function UserTable() {
    const [data, setData] = useState<any>([]);

    useEffect(() => {
        (async () => {
            try {
                const response = await fetch('http://localhost:8000/users');
                const data = await response.json();
                setData(data);
            } catch (e) {
                console.error(e);
            }
        })();
    }, []);


    const columns = [
        {
            title: 'id',
            dataIndex: 'id',
            key: 'id',
        },
        {
            title: 'Name',
            dataIndex: 'name',
            key: 'name',
        },
        {
            title: 'Address',
            dataIndex: 'address',
            key: 'address',
        }
    ];

    return <Table columns={columns} dataSource={data} rowKey="id" pagination={false} loading={!data}/>;
}
